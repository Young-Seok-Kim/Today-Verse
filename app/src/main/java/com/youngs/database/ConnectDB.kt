package com.youngs.database

import android.content.Context
import android.content.res.AssetManager
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.youngs.todayverse.verse.model.VerseModel
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

object ConnectDB {
    // DB파일 불러오는 함수
    // assets 폴더에 db파일 넣어주면됨~
    val ROOT_DIR = "/data/data/com.youngs.todayverse/databases/"
    val DB_NAME = "todayVerse.db"
    val DB_FULLPATH = "${ROOT_DIR}${DB_NAME}"



    fun setDB(ctx: Context) {
        val folder = File(ROOT_DIR)
        if (folder.exists()) {
        } else {
            folder.mkdirs()
        }

        val assetManager: AssetManager = ctx.resources.assets
        // db파일 이름 적어주기
        val outfile = File("${ROOT_DIR}${DB_NAME}")
        var `is`: InputStream? = null
        var fo: FileOutputStream? = null
        var filesize: Long = 0
        try {
            `is` = assetManager.open(DB_NAME, AssetManager.ACCESS_STREAMING)

            filesize = `is`.available().toLong()
            if (outfile.length() <= 0) {
                val tempdata = ByteArray(filesize.toInt())
                `is`.read(tempdata)
                `is`.close()
                outfile.createNewFile()
                fo = FileOutputStream(outfile)
                fo.write(tempdata)
                fo.close()
            }
        } catch (e: IOException) {
        }
    }

    // Cursor를 통해 .db파일의 내용을 보여주는 함수
    var db: SQLiteDatabase? = null
    lateinit var cursor: Cursor
    var mHelper: ProductDBHelper? = null

    fun selectTable(mContext : Context, tableName: String) : ArrayList<VerseModel> {
        DBDrop()
        setDB(mContext)


        mHelper = ProductDBHelper(mContext)
        db = mHelper?.writableDatabase
        val sql : String = "Select * FROM ${tableName}"
        cursor = db!!.rawQuery(sql, null)

        var tableCount = cursor.count


        var i = 0

        val verseModel = arrayListOf<VerseModel>()
        val verseHashMap = HashMap<String, String>()

        while (cursor.moveToNext()) { // 행
            for (j in 0 until cursor.columnCount) { // 열
//                println(cursor.getString(j))
                verseHashMap.set(cursor.getColumnName(j),cursor.getString(j))
            }
            verseModel.add(VerseModel(
                verseHashMap.get(cursor.getColumnName(0))?:"",
                verseHashMap.get(cursor.getColumnName(1))?:"",
                verseHashMap.get(cursor.getColumnName(2))?:"",
            ))
            verseHashMap.clear()
            i++
            tableCount = cursor.getInt(0)
        }
//        println("i : ${i}")

        println( "테이블의 행수 : " + tableCount)

        //////////////////////////


        return verseModel
    }



    fun DBDrop() {
        val dbFile = File(DB_FULLPATH)
        if (dbFile.delete()) {
            println(" 삭제 성공")
        } else {
            println(" 삭제 실패")
        }
    }
}