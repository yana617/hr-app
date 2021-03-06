package com.team5.utils;

import com.team5.dao.interfaces.EntityDao;
import com.team5.dao.interfaces.SortFilterCrudDao;

import static java.lang.Math.ceil;

public class Utils {
    public static int getPageOffset(int page,int total){
        if(page==1){}
        else{
            page=(page-1)*total+1;
        }
        return page;
    }

    public static int[] getPagesIndexArray(EntityDao entityDao, int total){
        float pagesCount = (float) entityDao.count() / total;
        int[] pages = new int[(int) ceil(pagesCount)];
        for(int i=0; i<pages.length; i++){
            pages[i] = i + 1;
        }
        return pages;
    }

    public static int[] getPagesIndexArray(SortFilterCrudDao entityDao, int total){
        float pagesCount = (float) entityDao.count() / total;
        int[] pages = new int[(int) ceil(pagesCount)];
        for(int i=0; i<pages.length; i++){
            pages[i] = i + 1;
        }
        return pages;
    }
}
