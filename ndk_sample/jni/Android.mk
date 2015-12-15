LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := test
LOCAL_SRC_FILES := com_example_test_business_SubProcess.cpp

include $(BUILD_SHARED_LIBRARY)
