W2

任务1

1.
example类图
![](http://www.plantuml.com/plantuml/png/RLJVJzim47xtN-571nAfFoW1iGU6b36aYQAMTPEcFRZj4RAbJfGusrZ7_xwpVOwS5eIKy_VTVVVvV73TQjdeRbSo1ghRyTkgQxPxnl5dVf-9oUWivYFyZM9cmSSlSp6PpM8-Ff-5yCT5bY4nYVbaEervUkcP3_FF2v5UOC4CfSvx-6wLYTa8uHHrKD4JoxklOZm-C_cNI8pIdiXMsRqOfrEa9ganS15TEIfvAfGiUQ4qRwuEaVm8MHF27wgsq4MbU4s1axCp45OjjWgnAuiSVRh7cUbYy-eIUGxQ1ZSl2wb-kZeC8fViZuBElwfYozlVilRDXLEHgjBFq4JibM49D4zo0tnPDHZkWygoajRQj-ySIjY1qkr060jyfwLk2fKRUm-bLC8eRqhPjlocMwzB2BKJfoZTWGfhh790xzbUhh13-J5q-WcdYwAXrHPqVyUZIPF77i-3v61o2AzasO5rJ_Qn5P1jNuBUlN1BZsIohDqILAwV8nOugpijo30ltTVUgV1PdiJsmX4M7v3OKrVlcqQ-XEQy8pBeXUXhGPzoQ24QpexOuopivRlT0lpjtz2l9Q4Sryb5ZdRlRJU4eDF32hpkeo-YLqZyQMZEYOc1vd3jq2vqjN4FDYOvnvhtaaqBTZ63TOk2VOC_iEaqUBhLKDFTNTTt_v8at6I2JnAop6Xm9i_-YJ4_-9Ct0EEJiMjGM_E_y3y0)



时序图
![](http://www.plantuml.com/plantuml/png/LP59IyDG58Nt-HKFibPecbReGaettOeY8kAYmuqDFfFm1ggk10VglAbMh1OtXI9KkcknmVwPlBQx_WLVXfHq5NBFkUVBoSrJLYACds150OkPx0nXqm9KeiX8nHDMWoB0EP1Wh26rW4kLurYbDc6Hb4Rg5YSEXbYh4pFMTAJkrUHR4kED-hFtAyUc9ZDjYmQ-ZCmmhMKwje-2SHQf-u2nNLSK8uNM3i9lEDmqKZdHQ8lnh_ZfU7_tlYh5RQXAAPER3ovdpPx3sNGu5dTV6zxeksXpKfKsBP6XvUPFG_7y6hOKZozXKZfXIKUO0Y-NCUm4dPT8ROdK8YG55deMRcFXtgvuif77_mExpi9zc4-QejqH5wxeludhhgmi_Ne2hgzqb1jYS3DjTSMavKq-_QMF7W7ACLjdfopQ3Lbwn0eE8HSDp6bDFYlOfg0eUR2g_kt_0G00)


2.
1）程序目的是创建七个实体，并将7个实体排序并把日志存入文件中
2）设计了对应的类
    a.Linable和接口实现Gourd类，表示葫芦娃，line类是葫芦娃的集合
    b.sorter和接口实现bubblesorter类，实现排序算法
    c.Geezer类实现日志保存
3）优点：模块清晰，相互之间不影响。在实现Geezer类时用了单例，是的日志输出唯一且稳定
4）可以改进之处：
    a.Position类可以单独实现
    b.Gourd里的getvalue不必要再套一个rank



任务2

实现256个妖怪排序，分别用快速排序和堆排序，类图如下
![](http://www.plantuml.com/plantuml/png/hLJ1SjCm4BtxAtIqIto06RYKGmE7mamFBMMuC0oZn1j7HP6Dj8QMq7z7rku6oUL8BfPstxvzJolb8g3sE1ri1MuwgCjXyjsnKl7tRFtywukNhsg_sgpwvhnAmNPddBRAE5J-V1dfdqGs757NGp1e1gT6NX1TQbSdjbLYM55PKv64OrI7Plj8GDK3fiMRXm_QVQEwk6W8BDkQzpy6qwdmKu_Il2OMxGRSWs-gnogMWD_fBQZRmSVbCQkqWqxIFdzHOE403aD170kaqorwu_fPthNLhfwPjrQ7eDOvRKjacZPSCyO22fpa9bycdSTTPcrcrnuSldSTt2VGTcziLqAkO8Tlv_1Vr9YgSkswkvi2lWFfHQTkmHKWTYXURlwJ5vQ4ovJq_Hw6CbaEwieulR6GJoe0daRyvA8nzIdUP-3ow3vfEq4op8vZAs2xKX8z2t7WEpgZQZw_7lTDbIaR9wnPiBBqJPwCe2JP0ricIKKoziHXxRr-oCM98XOeHFnDGO4i9JJbsN5sYKgzfDibmA_JxELLSbJX7cX5QRedAgGFjLfMz80VfOYdqCgk54TaTS5Plhee5wPnLWzfpNIKdUUbVO3qBhDhscJt5EvXEo58EY2Cx9swllxTjloGiyXD4JbhMN_5fpX3qjzD9LCu-qTW5brTWEkcW_q3)


任务3
实现矩阵，只需要在输出log时修改输出内容即可,实现matrix类，继承Line
![](http://www.plantuml.com/plantuml/png/hLJ1SXCn3BtxAtpSBTa3pC2b75eu56PwQ2d3XM4O9wjiNBpUnTP2IkY_Orjoi5EEvBAsz2Iz9ycvyAWSBgCH0kmoogjfSVr1oF1xTldywukNhngtMg-6zbmaOxVLLXcfBKftVcePdbZMR94tazUe9ojdFgHqLAv9sLOfmuh2Ma4K3e4UwiqZ0UK0c0vl7Zue-utYmg4bSBusVFynwLxwdshEnHlAeko4Et2jU1GX1DnMRK3UJIuS3qMacLIYzlcB10CZMFHLuX2GAzsXqtQ8z6wCiatCl37AUtbPfkqecQ8BnymXW0n7kacNJlsuBwJ5xCg1nVUsXtq2RNRQz3Na6hRuDfh_ekOKLN9N_VtYyHtaMjHr0xO2iSAivVO_QM5AMBhAkj_zL3lhGLrhgzO6oabvmEE8domQfpxQXm9Sj-wJCWiamQmub0AMcqE2vfpOyuv6LCFz6t3NYeBPl633XAMXRzAaCoex1s39HAboXfeuNJgd7afoeqAdzzm6kX2B0fDPiuXSZB_9c26dDDkwl-mzHQLQkTeLmA_ZVkINorQ9Ew0JkMcNf4yVAdKQCG1-p44ygIxVQdAKhAborYypq8LbZkmXdTjoR-DCbVEGtcwnocsnox27pOAGtHvXPkrKzVNlhkF7NbXkAyjPn_m5Tp52qb-Io5Cu-uSXaeuH2Kw35k82RB-CvWy0)

运行视频

![](https://www.bilibili.com/video/BV1WU4y1A7uS?spm_id_from=333.999.0.0)