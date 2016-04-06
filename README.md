# 代码模版
+ [c](#c)
    - [common](#common)
    - [io](#io)
    - [mic](#mic)
    - [openmp](#openmp)
+ [html](#html)
    - [common](#common-1)
    - [bootstrap](#bootstrap)
    - [html5](#html5)
    - [jquery](#jquery)
    - [threeJs](#threeJs)
+ [java](#java)
    - [common](#common-2)
    - [Spring](#Spring)
+ [ubuntu](#ubuntu)
    
## c
### common
* [printf_format.c: printf格式化输出示例](c/common/printf_format.c)
* [print_binary.c: 输出二进制](c/common/print_binary.c)
* [dynamic_array.c: 动态定义数组](c/common/dynamic_array.c)
* [timer.h: 程序计时](c/common/timer.h)
* [opt.c: 解析命令行参数](c/common/file.c)

### io
* [file_text.c: 读写文本文件 - fputc, fputs, fprintf, fgetc, fgets, fscanf](c/io/file_text.c)
* [file_binary.c: 读写二进制文件 - fseek, ftell, fread, fwrite, rewind](c/io/file_binary.c)
* [file_stat.c: 获得文件信息 - stat](c/io/file_stat.c)

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
* [share_pointer.c: 共享指针的内存分配及释放](c/mic/share_pointer.c)
* [share_pointer2.c: 在共享内存模式下, 使用二维指针](c/mic/share_pointer2.c)
* [sync_compute.c: MIC和CPU异步计算](c/mic/sync_compute.c)
* [sync_transfer.c: MIC和CPU异步数据传输](c/mic/sync_transfer.c)
* [multi_declare.c: 同时声明多个可以MIC上使用的变量或者函数](c/mic/multi_declare.c)
* [vector_hello.c: 向量化示例](c/mic/vector_hello.c)
* [vector2.c: 一些向量化函数(epi32)的使用: 加,减,乘,与,或,非,异或,移位,alignr](c/mic/vector2.c)

### openmp
* [parallel, for, section, singl, master, threadprivate 指令用法](c/openmp/omp_directive.c)
* [shared, private, default, firstprivate, lastprivate, nowait, schedule, if, reduction, copyin, copyprivate, num_threads 子句用法](c/openmp/omp_clause.c)
* [openmp函数用法](c/openmp/omp_function.md)
* [同步相关指令和函数, 包括barrier, ordered, critical, atomic, lock](c/openmp/omp_sync.c)

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
* [modal.html: bootstrap弹窗](html/bootstrap/modal.html) 
* [navigation.html: 导航示例](html/bootstrap/navigation.html)
* [switch.html: 开关切换插件](html/bootstrap/switch.html)
* [toaster.html: 信息提示插件](html/bootstrap/toaster.html)


### html5
* [FixCanvasSizeOnDevice.html: 使Canvas适应不同设备](html/html5/FixCanvasSizeOnDevice.html)
* [PrelaodImages.html: 预加载图片](html/html5/PreloadImages.html)

### jquery
* [jquery_qrcode.html: jquery 生成二维码](html/jquery/jquery_qrcode.html)
* [jquery_upload_file.html: Jquery-upload-file插件使用示例](html/jquery/jquery_upload_file.html)
* [jquery_upload_file_angular.md: Jquery-upload-file和angularjs集成](html/jquery/jquery_upload_file_angular.html)
* [operate_dom.html: 操作dom元素](html/jquery/operate_dom.html)

### threeJs
* [dynamictexture.html: 在立方体上显示数字](html/threejs/dynamictexture.html)
* [dynamictexture2.html: 在立方体上显示不同数字](html/threejs/dynamictexture2.html)
* [dynamictexture3.html: 在立方体上显示数字，可加边框](html/threejs/dynamictexture3.html)


## java
### common
* [BWTCode.java: BWT编码](java/common/BWTCode.java)
* [SortFile.java: 将读入的文件一行行的进行排序, 使用TreeMap](java/common/SortFile.java)

### Spring
* [Spring MVC HelloWolrd](java/spring/mvc/helloworld)
* [Spring MVC 文件上传简单示例](java/spring/mvc/uploadfile)
* [Spring MVC 文件上传简单示例--整合bootstrap-fileinput](java/spring/mvc/uploadfile-bootstrap-fileinput)
* [Spring MVC 文件上传简单示例--整合Jquery-File-Upload](java/spring/mvc/uploadfile-jQuery-File-Upload)
* [Spring MVC Rest简单示例](java/spring/mvc/rest)

## ubuntu
* [ubuntu_desktop.txt: 创建Ubuntu桌面快捷方式](ubuntu/ubuntu_desktop.txt)
* [shell.txt: 编写shell脚本](ubuntu/shell.txt)
