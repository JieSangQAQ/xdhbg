package cn.xdh.util;

import cn.xdh.entity.Works;

import java.util.List;

/**
 * @author TZB
 */
public class MyPaging {
    public static List<?> paging(List<?> list,int pageNum,int pageSize){
        //如果通过修改地址栏传值时pageNum的值为0时转换为1
        if(pageNum<1){pageNum=1;}
        int max=list.size();
        int maxpage=max/pageSize;
        int firstIndex = (pageNum - 1) * pageSize;
        int lastIndex = pageNum * pageSize;
        if(max<firstIndex){ return list.subList(maxpage*pageSize,list.size());}
        if(list.size()<lastIndex){ return list.subList(firstIndex,list.size());}
        return list.subList(firstIndex,lastIndex);

    }
}
