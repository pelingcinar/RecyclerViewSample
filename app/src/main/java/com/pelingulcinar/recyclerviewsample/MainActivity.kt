package com.pelingulcinar.recyclerviewsample

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pelingulcinar.recyclerviewsample.adapters.RecyclerAdapter
import com.pelingulcinar.recyclerviewsample.base.BaseActivity
import com.pelingulcinar.recyclerviewsample.data.UserDTO


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.mainRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val feed = ArrayList<UserDTO>()

        feed.add(UserDTO("UserName1", "https://avatars.githubusercontent.com/u/66577?v=3", 18096,"Blabla","https://image.freepik.com/free-vector/instagram-logo_1045-436.jpg"))
        feed.add(UserDTO("UserName2", "https://avatars.githubusercontent.com/u/66577?v=3", 18096,"Blabla","https://image.freepik.com/free-vector/instagram-logo_1045-436.jpg"))
        feed.add(UserDTO("UserName3", "https://avatars.githubusercontent.com/u/66577?v=3", 18096,"Blabla","https://image.freepik.com/free-vector/instagram-logo_1045-436.jpg"))
        feed.add(UserDTO("UserName4", "https://avatars.githubusercontent.com/u/66577?v=3", 18096,"Blabla","https://image.freepik.com/free-vector/instagram-logo_1045-436.jpg"))
        feed.add(UserDTO("UserName5", "https://avatars.githubusercontent.com/u/66577?v=3", 18096,"Blabla","https://image.freepik.com/free-vector/instagram-logo_1045-436.jpg"))

        val adapter = RecyclerAdapter(feed)

        recyclerView.adapter = adapter

    }
}
