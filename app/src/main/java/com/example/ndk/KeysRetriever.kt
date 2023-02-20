package com.example.ndk

object KeysRetriever {

    init {
        System.loadLibrary("api_keys")
    }

    external fun getFacebookApiKey(): String

    external fun getKhyalPrivateNumber() : String

}
