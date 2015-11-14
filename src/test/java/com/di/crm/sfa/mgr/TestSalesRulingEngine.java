package com.di.crm.sfa.mgr;

/**
 * 등록된 sales 정보에 대해 미리 정해놓은 기준에 맞는 경우,
 * 정해진 action 수행
 * 
 * 예) 10억이상 project에 대해 - action이 없는 경우 -> hr 기준 manager에게 상황 통보
 *    중요 project에 대해 end date 10일 전까지 quote가 없으면 manager에게 상황 통보
 *    
 *  -> 기존 프로젝트의 action들을 학습하여 engine logic 세울것!!
 *    예) 삼성전자, 10억 프로젝트 -> 이후 비슷한 조건일 경우 이전 action과 비교
 * 
 * -> 주요 확인 : action만..
 * 
 * @author hyun
 *
 */
public class TestSalesRulingEngine {

}
