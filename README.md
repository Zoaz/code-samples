# 代码模版

## c
### common
* [printf_format.c: printf格式化输出示例](c/common/printf_format.c)
* [print_binary.c: 输出二进制](c/common/print_binary.c)
* [dynamic_array.c: 动态定义数组](c/common/dynamic_array.c)
* [timer.h: 程序计时](c/common/timer.h)

### mic
* [helloworld.c: HelloWorld](c/mic/helloworld.c)
* [use_offloadh_api.c: 使用offload.h中的api](c/mic/use_offloadh_api.c)
* [offload_varfun.c: 定义可以在mic上使用的全局变量和函数](c/mic/offload_varfun.c)
* [offload_transdata.c: 在cpu和mic之间传输数据](c/mic/offload_transdata.c)
* [offload_static_array.c: 传输一维静态数组到mic上](c/mic/offload_static_array.c)
* [offload_static_array2.c: 传输二维静态数组到mic上](c/mic/offload_static_array2.c)
* [offload_pointer.c: 传输指针](c/mic/offload_pointer.c)
* [offload_pointter2.c: 传输指针(指针指向的数组中每个元素是一个一维静态数组)](c/mic/offload_pointer2.c)
* [offload_struct.c: 传输结构体(结构体中包含一个指针)](c/mic/offload_struct.c)
* [offload_into.c: 将一个变量的值传到另外一个变量中 ](c/mic/offload_into.c)
* [offload_alloc_free.c: 使用alloc_if以及free_if控制内存分配和释放](c/mic/offload_alloc_free.c)
* [share_varfun.c: 在共享内存模式下, 定义可以在mic和cpu上共享的变量和函数](c/mic/share_varfun.c)
* [share_pointer.c: 在共享内存模式下, 共享指针的内存分配及释放](c/mic/share_pointer.c)
* [share_pointer2.c: 在共享内存模式下, 使用二维指针](c/mic/share_pointer2.c)
* [vector_hello.c: 使用MIC的向量化单元进行计算的简单示例](c/mic/vector_hello.c)

## html 
### common
* [avoidTextAround.html：防止文字环绕](html/common/avoidTextAround.html)
* [CenterContent.html: 居中显示内容](html/common/CenterContent.html)
* [clearFloat.html：清除浮动](html/common/clearFloat.html)
* [flexDemo.html：使用flex布局示例](html/common/flexDemo.html)
* [JsonToCheckBox.html: 根据json格式信息自动生成checkbox](html/common/JsonToCheckbox.html)

### bootstrap
* [fix_footer.html: 底部固定](html/bootstrap/fix_footer.html)
* [loading.html: 加载插件](html/bootstrap/loading.html)  
* [navigation.html: 导航示例](html/bootstrap/navigation.html)
* [switch.html: 开关切换插件](html/bootstrap/switch.html)
* [toaster.html: 信息提示插件](html/bootstrap/toaster.html)


### html5
* [FixCanvasSizeOnDevice.html: 使Canvas适应不同设备](html/html5/FixCanvasSizeOnDevice.html)
* [PrelaodImages.html: 预加载图片](html/html5/PreloadImages.html)


### threeJs
* [dynamictexture.html: 在立方体上显示数字](html/html5/dynamictexture.html)
* [dynamictexture2.html: 在立方体上显示不同数字](html/html5/dynamictexture2.html)
* [dynamictexture3.html: 在立方体上显示数字，可加边框](html/html5/dynamictexture3.html)

## ubuntu
* [ubuntu_desktop.txt: 创建Ubuntu桌面快捷方式](ubuntu/ubuntu_desktop.txt)
* [shell.txt: 编写shell脚本](ubuntu/shell.txt)
