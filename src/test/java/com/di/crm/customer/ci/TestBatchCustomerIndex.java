package com.di.crm.customer.ci;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

import com.di.approval.controller.ApprovalControllerImpl;
import com.di.approval.domain.Approval;
import com.di.util.Code.BatchPeriod;
import com.di.util.Code.BatchStatus;
import com.di.util.Code.LineType;
import com.di.util.Code.Type;

/**
 * Customer Index : assessment of the customer,
 * 					sales amount, margin, voc, etc
 * 		
 * 					range : 1 ~ 100
 * @author hyun
 *
 */

public class TestBatchCustomerIndex {

	/*
	private BatchJobScheduler scheduler = null;
	private BatchJob batchJob = null;
	private String batchId = null;
	
	@Before
	public void setUp() {
		batchJob = new CustomerIndexBatchJob();
		scheduler = new CrmBatchJobScheduler();
	}
	
	@Test
	public void testReigsterCustomerBatchJob() {
		CalcCustomerIndex calcCustomerIndexMonthly = new CalcCustomerIndex();
		
		batchJob.setWorkingJob(calcCustomerIndexMonthly);
		batchJob.setApprovalCode(approvalCode);
		batchJob.setRunPeriod(BatchPeriod.ONCE, DataUtil.getAfterMinute(5));
		
		scheduler.register(batchJob);
		assertThat(scheduler.search(batchJob), is(batchJob));
		assertThat(changedBatch.getStatus(), is(BatchStatus.READY));
		
		//TODO : 5분 후 실행?
		//Mock 실행 구현요~
		
		//assertThat(JsonHandler.get("result", batchJob.searchRunResult(batchId)), is("success"));
	}
	
	@Test
	public void testChangeBatchPeriod() {
		assertThat(scheduler.search(batchJob), is(batchJob));
		assertThat(batchJob.getBatchId(), is(batchId));
		
		batchJob.changeRunPeriod(BatchPeriod.DAILY);
		scheulder.change(batchJob);
	
		CustomerIndexBatchJob changedBatch = scheduler.search(batchJob);
		
		assertThat(changedBatch.getRunPeriod(), is(BatchPeriod.DAILY));
		assertThat(changedBatch.getStatus(), is(BatchStatus.READY));
	}
	
	@Test
	public void testDeleteBatchJob() {
		assertThat(scheduler.search(batchJob), is(batchJob));
		assertThat(batchJob.getBatchId(), is(batchId));
		
		scheduler.delete(batchJob);
		assertNull(scheduler.search(batchJob));
	}
	
	@Test
	public void testSearchBatchJob() {
		assertThat(scheduler.search(batchJob), is(batchJob));
		assertThat(batchJob.getBatchId(), is(batchId));
	}
	
	@Test
	public void testPendingBatchJob() {
		assertThat(scheduler.search(batchJob), is(batchJob));
		assertThat(batchJob.getBatchId(), is(batchId));
		assertThat(batchJob.getStatus(), is(BatchStatus.READY));
		
		BatchJob pendingBatchJob = scheduler.pendingJob(batchJob);
		assertThat(pendingBatchJob.getStatus(), is(BatchStatus.PENDING));
	}
	*/
}
