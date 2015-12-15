#include <jni.h>
#include <com_example_test_business_SubProcess.h>

JNIEXPORT jstring JNICALL Java_com_example_test_business_SubProcess_getWord
  (JNIEnv* env, jclass){
	return (env)->NewStringUTF("That is way i like it");
}

/*
 * Class:     com_example_test_business_SubProcess
 * Method:    getHello
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_test_business_SubProcess_getHello
  (JNIEnv* env, jobject){
	return (env)->NewStringUTF("That is world i like it");
}
