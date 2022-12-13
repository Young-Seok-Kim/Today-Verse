package com.youngs.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

//새로 생성한 adapter 속성은 SQLiteOpenHelper이다.

class ProductDBHelper (context: Context?) : SQLiteOpenHelper(context, "todayVerse.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        // TODO Auto-generated method stub
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // TODO Auto-generated method stub
    }
}
