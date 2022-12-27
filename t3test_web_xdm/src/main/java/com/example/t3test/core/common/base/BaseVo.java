package com.example.t3test.core.common.base;

import com.example.t3test.core.common.constants.Constants;


public class BaseVo {

    //	paging
    private int thisPage = 1;									// 현재 페이지
    private int rowNumToShow = Constants.ROW_NUM_TO_SHOW;		// 화면에 보여줄 데이터 줄 갯수
    private int pageNumToShow = Constants.PAGE_NUM_TO_SHOW;		// 화면에 보여줄 페이징 번호 갯수

    private int totalRows;										// 전체 데이터 갯수
    private int totalPages;										// 전체 페이지 번호
    private int startPage;										// 시작 페이지 번호
    private int endPage;										// 마지막 페이지 번호

    private int startRnumForOracle = 1;							// 쿼리 시작 row
    private int endRnumForOracle;								// 쿼리 끝 row
    private Integer RNUM;

    private int startRnumForMysql = 0;							// 쿼리 시작 row


    //	search
    private Integer shUseNy;
    private Integer shDelNy;
    private Integer shOptionDate;
    private String shDateStart;
    private String shDateEnd;
    private Integer shOption;
    private String ShValue;


    //	list
    private String[] checkboxSeqArray;

    //	----------
//    public void setParamsPaging(int totalRows) {
//
////		setThisPage(3);
//
//        setTotalRows(totalRows);
//
//        if (getTotalRows() == 0) {
//            setTotalPages(1);
//        } else {
//            setTotalPages(getTotalRows() / getRowNumToShow());
//        }
//
//        if (getTotalRows() % getRowNumToShow() > 0) {
//            setTotalPages(getTotalPages() + 1);
//        }
//
//        if (getTotalPages() < getThisPage()) {
//            setThisPage(getTotalPages());
//        }
//
//        setStartPage(((getThisPage() - 1) / getPageNumToShow()) * getPageNumToShow() + 1);
//
//        setEndPage(getStartPage() + getPageNumToShow() - 1);
//
//        if (getEndPage() > getTotalPages()) {
//            setEndPage(getTotalPages());
//        }
//
//        setEndRnumForOracle((getRowNumToShow() * getThisPage()));
//        setStartRnumForOracle((getEndRnumForOracle() - getRowNumToShow()) + 1);
//        if (getStartRnumForOracle() < 1) setStartRnumForOracle(1);
//
//        if (thisPage == 1) {
//            setStartRnumForMysql(0);
//        } else {
//            setStartRnumForMysql((getRowNumToShow() * (getThisPage()-1)));
//        }

//		System.out.println("getThisPage():" + getThisPage());
//		System.out.println("getTotalRows():" + getTotalRows());
//		System.out.println("getRowNumToShow():" + getRowNumToShow());
//		System.out.println("getTotalPages():" + getTotalPages());
//		System.out.println("getStartPage():" + getStartPage());
//		System.out.println("getEndPage():" + getEndPage());
//		System.out.println("getStartRnumForOracle():" + getStartRnumForOracle());
//		System.out.println("getEndRnumForOracle():" + getEndRnumForOracle());
//		System.out.println("getStartRnumForMysql(): " + getStartRnumForMysql());


}
