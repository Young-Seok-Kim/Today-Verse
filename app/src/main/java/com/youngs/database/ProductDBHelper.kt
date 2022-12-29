package com.youngs.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

//새로 생성한 adapter 속성은 SQLiteOpenHelper이다.

class ProductDBHelper (context: Context?,version : Int) : SQLiteOpenHelper(context, "todayVerse.db", null, version) {

    // 앱을 배포할때 이미 값들을 넣어주고 배포를 하므로 따로 insert를 신경쓸 필요는 없는듯?

    override fun onCreate(db: SQLiteDatabase) {
            insertVerse(db,"볼드윈","인생에 뜻을 세우는데 적당한 때는 없다.")
            insertVerse(db,"하버트 개서","실패는 잊어라, 하지만 그것이 준 교훈은 절대 잊으면 안 된다.")
            insertVerse(db,"윌리엄 제임스","우리는 행복하기 때문에 웃는 게 아니라, 웃기 때문에 행복하다.")
            insertVerse(db,"오스카 와일드","너 자신이 돼라. 다른 사람은 이미 있으니까.")
            insertVerse(db,"작자 미상","세상에 공짜는 없다.")
            insertVerse(db,"작자 미상","또 후회한들 무엇하랴.")
            insertVerse(db,"찰리 채플린","인생은 가까이서 보면 비극, 멀리서 보면 희극이다.")
            insertVerse(db,"J. 하비스","승자는 시간을 관리하며 살고 패자는 시간에 끌려 산다.")
            insertVerse(db,"나딘 스테어","인생을 다시 산다면 다음번에는 더 많은 실수를 저지르리라.")
            insertVerse(db,"P.시루스","최고에 도달하려면 최저에서 시작해라.")
            insertVerse(db,"애드워즈 데밍","배움은 의무도, 생존도 아니다.")
            insertVerse(db,"칭기즈칸","행동의 가치는 그 행동을 끝까지 이루는 데 있다.")
            insertVerse(db,"기시미 이치로","아무것도 하지 않으면 아무일도 일어나지 않는다.")
            insertVerse(db,"론 무어","일단 시작해라. 나중에 완벽해지면 된다.")
            insertVerse(db,"헤라클레이토스","인격은 그 사람의 운명이다.")
            insertVerse(db,"베이컨","아는 것이 힘이다.")
            insertVerse(db,"작자미상","자나깨나 말조심")
            insertVerse(db,"박명수","참을 인 세번이면 호구다.")
            insertVerse(db,"셸리","겨울이 오면 봄이 멀지 않으리")
            insertVerse(db,"나폴레옹","내 비장의 무기는 아직 손 안에 있다. 그것은 희망이다.")
            insertVerse(db,"아들라이 E.스티븐슨","모든 이의 마음을 얻으려고 계산된 글은 그 누구의 마음도 얻지 못한다.")
            insertVerse(db,"스티븐 코비","가장 큰 위험은 위험 없는 삶이다.")
            insertVerse(db,"벤자민 프랭클린","오늘 할 수 있는 일을 내일로 미루지 마라.")
            insertVerse(db,"워랜 버핏","위험은 자신이 무엇을 하는지 모르는데서 온다.")
            insertVerse(db,"니체","모든 사람들로부터 사랑받지 않아도 된다.")
            insertVerse(db,"작자 미상","겉모습에 속지 마라")
            insertVerse(db,"작자 미상","망설이면 두려움만 커진다.")
            insertVerse(db,"작자 미상","우리 자신에게 실패를 허락하는 것이 성공을 허락하는 것이다.")
            insertVerse(db,"작자 미상","미래를 만드는 건 현재다.")
            insertVerse(db,"엘릭스 코브","못하는 일에 초점 맞추기를 그만하면 자기가 어떤 일을 할 수 있는지 알고 놀라게 될 것이다.")
            insertVerse(db,"아이스 킬로스","글은 병든 마음 고치는 의사다")
            insertVerse(db,"카토","인내가 최상의 미덕이다.")
            insertVerse(db,"작자 미상","웃는자에게 복이 온다.")
            insertVerse(db,"작자 미상","수학은 정답이 있지만 인생은 정답이 없더라.")
            insertVerse(db,"작자 미상","익숙함을 당연하게 생각하지 마세요.")
            insertVerse(db,"작자 미상","그리움과 분노는 한 끗 차이")
            insertVerse(db,"윌리엄 제임스","삶이 가치가 있다고 믿어라. \n그러면 그 믿음은 현실이 될 것이다.")
            insertVerse(db,"에머슨","가난은 가난하다고 느끼는 곳에 존재한다.")
            insertVerse(db,"로버트 엘리엇","피할 수 없으면 즐겨라.")
            insertVerse(db,"작자 미상","계단을 밟아야 계단 위에 올라 설 수 있다.")
            insertVerse(db,"허버드","행복은 습관이다.")
            insertVerse(db,"다이앤 프롤로그","인생은 위험의 연속이다.")
            insertVerse(db,"에리카 종","아무런 위험을 감수하지 않는다면, 더 큰 위험을 감수하게 될 것이다.")
            insertVerse(db,"작자 미상","진흙 속에서 피는 꽃")
            insertVerse(db,"나폴레옹","훌륭한 사람과 어리석은 사람의 차이는 불과 한 걸음 차이다.")
            insertVerse(db,"볼테르","사람들은 할 말이 없으면 욕을한다.")
            insertVerse(db,"도교","정해진 것은 아무것도 없다. 정해진 운명 또한 없다.")
            insertVerse(db,"F.쉴러","너의 운명의 별은 너의 마음속에 있다.")
            insertVerse(db,"샬 루스트","같은 것을 놓고 좋아하고 싫어하는것, 그것이 바로 진정한 우정이다.")
            insertVerse(db,"호라티우스","당신의 하루하루를 당신의 마지막 날이라고 생각하라.")
            insertVerse(db,"데모스테네스","작은 기회로부터 위대한 업적이 시작된다.")
            insertVerse(db,"아인슈타인","인생은 자전거를 타는 것과 같다. 쓰러지지 않으려면 뛰어야 한다.")
            insertVerse(db,"마거릿 미드","미래는 지금이다.")
            insertVerse(db,"트루먼 카포티","실패는 성공을 돋보이게 하는 조미료")
            insertVerse(db,"말콤 포브스","실패로부터 배울 수 있다면 그 실패는 성공이다.")
            insertVerse(db,"모차르트","꿈을 꾸기에 인생은 빛난다.")
            insertVerse(db,"작자 미상","젊은이는 소망으로 살고, 노인은 추억으로 산다.")
            insertVerse(db,"작자 미상","길을 잃는다는 것은 곧, 길을 알게 되는 것이다.")
            insertVerse(db,"헬렌 미렌","인생의 비결은 그것을 다루는 방법입니다.")
            insertVerse(db,"바바라 셔","하는 것은 상상에서 비약적인 도약입니다.")
            insertVerse(db,"작자미상","입을 연 이상 비밀은 없다.")
            insertVerse(db,"작자미상","남 생각에 나를 맞추지 마세요.")
            insertVerse(db,"푸블릴리우스 시루스","스스로 행복하다고 믿지 않으면, 그 누구도 행복할 수 없다.")
            insertVerse(db,"상 파울","인생은 한권의 책과 같다.")
            insertVerse(db,"에디슨","변명 중에서 가장 어리석은 변명은 시간이 없어서이다.")
            insertVerse(db,"작자 미상","만남은 인연이다, 소중한 인연 소중하게 대하라")
            insertVerse(db,"작자 미상","인내는 쓰다. 그러나 그 열매는 달다.")
            insertVerse(db,"작자 미상","인생은 풀어야 하는 문제가 아니라 경험해야 하는 현실이다.")
            insertVerse(db,"상응부경전","이 세상에서 자기 자신보다 사랑스러운것은 없다.")
            insertVerse(db,"앤디워홀","인생은 스스로 되풀이 하면서 변화하는 모습의 연속이 아닐까?")
            insertVerse(db,"월트 디즈니","꿈을 꿀 수 있다면, 그 꿈을 실현할 수 있다.")
            insertVerse(db,"작자 미상","멈추지 말고 느리게라도 뛰어봐")
            insertVerse(db,"앙드레 말로","오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아간다.")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (oldVersion < 2) {
            db.execSQL("CREATE TABLE IF NOT EXISTS sqlite_sequence(name,seq)")

            db.execSQL("""CREATE TABLE IF NOT EXISTS "t_VERSE" ( "VERSE_NO" INTEGER NOT NULL, "VERSE_SPEAKER" TEXT DEFAULT '작자미상', "VERSE_CONTENT" TEXT, PRIMARY KEY("VERSE_NO" AUTOINCREMENT) )""")
        }
    }

    private fun insertVerse(db : SQLiteDatabase, speaker : String, content : String)
    {
        db.execSQL("INSERT INTO t_VERSE(VERSE_SPEAKER, VERSE_CONTENT) VALUES('${speaker}','${content}');")
    }
}
