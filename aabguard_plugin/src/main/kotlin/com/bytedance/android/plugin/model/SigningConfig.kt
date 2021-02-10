package com.bytedance.android.plugin.model

import com.google.common.base.MoreObjects
import org.gradle.api.Action
import java.io.File

/**
 * Created by YangJing on 2020/01/07 .
 * Email: yangjing.yeoh@bytedance.com
 */
open class SigningConfig {
    var storeFile: File? = File("storeFile")
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

    fun storeFile(action: Action<File>) {

        action.execute(storeFile)
    }

    override fun toString(): String
    {
        return "storeFile=${storeFile?.absolutePath}," +
                "storePassword=$storePassword,"+
                "keyAlias=$keyAlias,"+
                "keyPassword=$keyPassword";
    }
}
