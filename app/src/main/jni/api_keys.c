#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_ndk_KeysRetriever_getFacebookApiKey(JNIEnv *env, jclass clazz) {
 return (*env)->  NewStringUTF(env, "TmF0aXZlNWVjcmV0UEBzc3cwcmQx");
}

JNIEXPORT jstring JNICALL
Java_com_example_ndk_KeysRetriever_getKhyalPrivateNumber(JNIEnv *env, jclass clazz) {
 return (*env)->  NewStringUTF(env, "010000000000000");
}
