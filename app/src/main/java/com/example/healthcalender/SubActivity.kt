package com.example.healthcalender

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.healthcalender.databinding.ActivitySubBinding
import androidx.recyclerview.widget.LinearLayoutManager

class SubActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        //유산소 목록
        val data = mutableListOf<Member>(
            Member("런닝"),
            Member("사이클"),
            Member("일립티컬 머신"),
            Member("줄넘기"),
            Member("로잉 머신"),
            Member("걷기")
        )
        //목 목록
        val data2 = mutableListOf<Member>(
            Member("넥 레이즈:사이드"),
            Member("넥 레이즈")
        )
        //승모근 목록
        val data3 = mutableListOf<Member>(
            Member("슈러그"),
            Member("슈러그 : 바벨"),
            Member("슈러그 : 덤벨"),
            Member("슈러그 : 케이블"),
            Member("슈러그 : 스미스머신"),
            Member("Y-레이즈"),
            Member("Y-레이즈 : 맨몸")
        )
        //어꺠 목록
        val data4 = mutableListOf<Member>(
            Member("숄더 프레스 : 앉아서, 덤벨"),
            Member("숄더 프레스 : 앉아서, 스미스머신"),
            Member("숄더 프레스 : 앉아서, 머신"),
            Member("숄더 프레스 : 앉아서, 바벨"),
            Member("숄더 프레스 : 스탠딩, 덤벨"),
            Member("숄더 프레스 : 스탠딩, 원암, 덤벨"),
            Member("숄더 프레스 : 스탠딩, 케이블"),
            Member("숄더 프레스 : 스탠딩, 바벨"),
            Member("백 플라이 : 머신"),
            Member("백 플라이 : 밴드"),
            Member("백 플라이 : 케이블"),
            Member("사이드 레터럴 레이즈 : 덤벨"),
            Member("사이드 레터럴 레이즈 : 머신")
        )
        //가슴 목록
        val data5 = mutableListOf<Member>(
            Member("플라이"),
            Member("벤치 프레스 : 덤벨"),
            Member("벤치 프레스 : 바벨"),
            Member("벤치 프레스 : 인클라인, 덤벨"),
            Member("벤치 프레스 : 인클라인, 스미스머신"),
            Member("벤치 프레스 : 인클라인, 바벨"),
            Member("벤치 프레스 : 인클라인, 케이블"),
            Member("벤치 프레스 : 디클라인, 바벨"),
            Member("벤치 프레스 : 디클라인, 덤벨"),
            Member("벤치 프레스 : 디클라인, 머신"),
            Member("체스트 프레스 : 머신"),
            Member("체스트 프레스 : 인클라인, 머신"),
            Member("체스트 프레스 : 시티드, 케이블"),
            Member("체스트 프레스 : 디클라인, 머신"),
            Member("팩덱 플라이")
        )
        //등 목록
        val data6 = mutableListOf<Member>(
            Member("로우 : 머신"),
            Member("로우 : 앉아서, 케이블"),
            Member("로우 : 스미스머신"),
            Member("로우 : 펜들레이"),
            Member("데드리프트 : 루마니안, 등"),
            Member("데드리프트 : 스티프, 등"),
            Member("렛풀다운")
        )
        //삼두 목록
        val data7 = mutableListOf<Member>(
            Member("트라이셉스 익스텐션 : 시티드, 덤벨"),
            Member("트라이셉스 익스텐션 : 클로즈 그립, 바벨"),
            Member("트라이셉스 익스텐션 : 원암, 덤벨"),
            Member("트라이셉스 익스텐션 : 시티드, 바벨"),
            Member("푸시다운 : 케이블"),
            Member("푸시다운 : 로프, 케이블")
        )
        //이두 목록
        val data8 = mutableListOf<Member>(
            Member("바벨 컬"),
            Member("케이블 컬"),
            Member("머신 컬"),
            Member("덤벨 컬"),
            Member("해버 컬")
        )
        //전완 목록
        val data9 = mutableListOf<Member>(
            Member("리스트 컬"),
            Member("악력기")
        )
        //복부 목록
        val data10 = mutableListOf<Member>(
            Member("싯업"),
            Member("크런치")
        )
        //허리 목록
        val data11 = mutableListOf<Member>(
            Member("백 익스텐션"),
            Member("슈퍼맨"),
            Member("플랭크")
        )
        //엉덩이 목록
        val data12 = mutableListOf<Member>(
            Member("힙 어브덕션 : 케이블"),
            Member("힙 어브덕션 : 머신"),
            Member("힙 익스텐션 : 스트레이트"),
            Member("힙 익스텐션 : 벤트")
        )
        //하체 목록
        val data13 = mutableListOf<Member>(
            Member("레그 컬"),
            Member("스쿼트"),
            Member("레그 레이즈"),
            Member("레그 익스텐션"),
            Member("레그 프레스")
        )
        //종아리 목록
        val data14 = mutableListOf<Member>(
            Member("카프 레이즈")
        )
        //전신 목록
        val data15 = mutableListOf<Member>(
            Member("클린"),
            Member("버드독"),
            Member("스윙")
        )
        //스트레칭 목록
        val data16 = mutableListOf<Member>(
            Member("무릎 돌리기"),
            Member("백 로테이션")
        )
        //스포츠 목록
        val data17 = mutableListOf<Member>(
            Member("축구"),
            Member("농구"),
            Member("야구"),
            Member("골프"),
        )

        //전체 목록
        val allData = data + data2 + data3 + data4 + data5 + data6 + data7 + data8 + data9 + data10 + data11 + data12 + data13 + data14 + data15 + data16 + data17


        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //전체 목록
        binding.btnAll.setOnClickListener {
            refreshRecyclerView(allData as MutableList<Member>)
        }
        //유산소 목록
        binding.btnAer.setOnClickListener {
            refreshRecyclerView(data)
        }
        //목 목록
        binding.btnNeck.setOnClickListener {
            refreshRecyclerView(data2)
        }
        //승모근 목록
        binding.btnTra.setOnClickListener {
            refreshRecyclerView(data3)
        }
        //어깨 목록
        binding.btnSho.setOnClickListener {
            refreshRecyclerView(data4)
        }
        //가슴 목록
        binding.btnChe.setOnClickListener {
            refreshRecyclerView(data5)
        }
        //등 목록
        binding.btnBack.setOnClickListener {
            refreshRecyclerView(data6)
        }
        //삼두 목록
        binding.btnTri.setOnClickListener {
            refreshRecyclerView(data7)
        }
        //이두 목록
        binding.btnDoub.setOnClickListener {
            refreshRecyclerView(data8)
        }
        //전완 목록
        binding.btnAnt.setOnClickListener {
            refreshRecyclerView(data9)
        }
        //복부 목록
        binding.btnSto.setOnClickListener {
            refreshRecyclerView(data10)
        }
        //허리 목록
        binding.btnWai.setOnClickListener {
            refreshRecyclerView(data11)
        }
        //엉덩이 목록
        binding.btnHip.setOnClickListener {
            refreshRecyclerView(data12)
        }
        //하체 목록
        binding.btnLeg.setOnClickListener {
            refreshRecyclerView(data13)
        }
        //종아리 목록
        binding.btnCalf.setOnClickListener {
            refreshRecyclerView(data14)
        }
        //전신 목록
        binding.btnBody.setOnClickListener {
            refreshRecyclerView(data15)
        }
        //스트레칭 목록
        binding.btnStretch.setOnClickListener {
            refreshRecyclerView(data16)
        }
        //스포츠 목록
        binding.btnSports.setOnClickListener {
            refreshRecyclerView(data17)
        }
    }
    private fun refreshRecyclerView(data: MutableList<Member>){
        val adapter = Adapter()
        adapter.listData = data
        binding.lstUser.adapter = adapter
        binding.lstUser.layoutManager = LinearLayoutManager(this)
    }
}