package com.example.database

import android.content.Context
import android.content.res.AssetManager
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

object ConnectDB {
    // DB파일 불러오는 함수
// assets 폴더에 db파일 넣어주면됨~

    // DB파일 불러오는 함수
    // assets 폴더에 db파일 넣어주면됨~
    // /data/user/0/com.example.todayverse/databases/todayVerse.db
    val ROOT_DIR = "/data/data/com.example.todayverse/databases/"
    val DB_NAME = "todayVerse.db"

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
            `is` = assetManager.open(DB_NAME, AssetManager.ACCESS_BUFFER)
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
    var tableName = "t_VERSE"

    fun ShowMushDBInfo(mContext : Context, name: String) {
        setDB(mContext)
        mHelper = ProductDBHelper(mContext)
        db = mHelper?.writableDatabase
        var mushname: String? = null
        var mushtype: String? = null
        var mushsym: String? = null
        var mushsim: String? = null
        val sql = "Select * FROM ${tableName}"
        cursor = db!!.rawQuery(sql, null)
        while (cursor.moveToNext()) {
            System.out.println("테스트 " + cursor.getString(0))
            System.out.println("테스트 " + cursor.getString(1))
            System.out.println("테스트 " + cursor.getString(2))
//            if (cursor.getString(1).equals(name)) {
//                mushname = cursor.getString(1)
//                mushtype = cursor.getString(2)
//                mushsym = cursor.getString(3)
//                mushsim = cursor.getString(4)
//            }
        }
//
//        mname.setText(mushname)
//        mtype.setText(mushtype)
//        msym.setText(mushsym)
//        msim.setText(mushsim)
    }
}