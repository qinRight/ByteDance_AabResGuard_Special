package com.bytedance.android.plugin.model

import java.io.File

/**
 * Created by YangJing on 2020/01/07 .
 * Email: yangjing.yeoh@bytedance.com
 */
open class SigningConfig {
    var storeFile: File? = null
    var storePassword: String? = null
    var keyAlias: String? = null
    var keyPassword: String? = null
    constructor()
    constructor(file: File,storeps:String,keya:String,keyP:String){
        storeFile = file
        storePassword = storeps
        keyAlias = keya
        keyPassword = keyP
    }
}
