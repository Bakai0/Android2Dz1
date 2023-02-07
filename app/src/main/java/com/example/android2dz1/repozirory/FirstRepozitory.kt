package com.example.android2dz1.repozirory

import com.example.android2dz1.model.HomeModel

class FirstRepozitory {
    private val firstModelList: ArrayList<HomeModel> = ArrayList()

    fun getListOfCat(): ArrayList<HomeModel> {
        firstModelList.add(HomeModel("https://http.cat/100", "Continue"))
        firstModelList.add(HomeModel("https://http.cat/101", "Switching Protocols"))
        firstModelList.add(HomeModel("https://http.cat/102", "Processing"))
        firstModelList.add(HomeModel("https://http.cat/103", "Early Hints"))
        firstModelList.add(HomeModel("https://http.cat/200", "OK"))
        firstModelList.add(HomeModel("https://http.cat/201", "Created"))
        firstModelList.add(HomeModel("https://http.cat/202", "Accepted"))
        firstModelList.add(HomeModel("https://http.cat/203", "Non-Authoritative Information"))
        firstModelList.add(HomeModel("https://http.cat/206", "Partial Content"))
        firstModelList.add(HomeModel("https://http.cat/207", "Multi-Status"))
        firstModelList.add(HomeModel("https://http.cat/300", "Multiple Choices"))
        firstModelList.add(HomeModel("https://http.cat/301", "Moved Permanently"))
        firstModelList.add(HomeModel("https://http.cat/302", "Found"))
        firstModelList.add(HomeModel("https://http.cat/303", "See Other"))
        firstModelList.add(HomeModel("https://http.cat/304", "Not Modified"))
        firstModelList.add(HomeModel("https://http.cat/305", "Use Proxy"))
        return firstModelList
    }
}