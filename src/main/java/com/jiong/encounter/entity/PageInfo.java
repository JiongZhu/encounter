package com.jiong.encounter.entity;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 0:39 2018/6/3
 * @Modified By:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    //当前�?
    private int pageNum;
    //每页的数�?
    private int pageSize;
    //总记录数
    private long total;
    //总页�?
    private int pages;
    //结果�?
    private List<T> list;
    //是否为第�?�?
    private boolean isFirstPage = false;
    //是否为最后一�?
    private boolean isLastPage = false;

    //导航页码�?
    private int navigatePages;
    //�?有导航页�?
    private List<Integer> navigatepageNums;

    private String url; //url的条�?

    public PageInfo() {
    }
    /**
     * 包装Page对象
     *
     * @param list
     */
    public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getCurrent();
            this.pageSize = page.getSize();
            this.pages = (int) page.getPages();
            this.list = page.getRecords();
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();
            this.pages = 1;
            this.list = list;
            this.total = list.size();
        }
        if (list instanceof Collection) {
            //判断页面边界
            judgePageBoudary();
            //计算导航�?
            getNavigatepage();
        }
    }
    /**
     * 判定页面边界
     */
    public void judgePageBoudary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == pages;
    }

    /**
     * 根据显示的导航页码数 计算得到导航�?
     * @param
     *
     */
    public void getNavigatepage(){
        this.navigatePages = 5;
        this.navigatepageNums = new ArrayList<>();
        //1.如果总页�?<=navigatePages，那么页码列表为1 ~ totaPage 从第�?页到总页�?
        if(this.pages <= navigatePages){
            for(int i=1;i<=this.pages;i++){
                this.navigatepageNums.add(i);
            }
        }else{
            //2.总页�?>navigatePages的情�?
            //按公式计算，让列表的头为当前�?-((navigatePages-1)/2)；列表的尾为当前�?+((navigatePages-1)/2)
            int begin = this.pageNum - ((navigatePages - 1) / 2);
            int end = this.pageNum + ((navigatePages - 1) / 2);
            //处理begin出界
            if(begin < 1){
                //如果�?头的导航码数小于1了，那么导航的码数就应该�?1到navigatePages的情�?
                for(int i=1;i<=this.pages;i++){
                    this.navigatepageNums.add(i);
                }
            }else if(end > this.pages){
                //处理end结尾的问�?
                //如果导航结尾超过总页码数，那么结尾应该为总页码数，开头应该为总页码数 - navigatePages
                for(int i=this.pages - navigatePages + 1;i<=this.pages;i++){
                    this.navigatepageNums.add(i);
                }
            }else{
                for(int i=begin;i<=end;i++){
                    this.navigatepageNums.add(i);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", pages=" + pages +
                ", list=" + list +
                ", isFirstPage=" + isFirstPage +
                ", isLastPage=" + isLastPage +
                ", navigatePages=" + navigatePages +
                ", navigatepageNums=" + navigatepageNums +
                ", url='" + url + '\'' +
                '}';
    }
}
