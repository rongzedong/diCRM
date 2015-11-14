package com.di.crm.rest.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.di.crm.common.config.AppConfig;
import com.di.crm.rest.config.RestAppConfig;

import org.junit.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes={AppConfig.class,RestAppConfig.class})
public class TestApprovalListAsJson {
	Logger logger = LoggerFactory.getLogger(TestApprovalListAsJson.class);

	private MockMvc mockMvc;
	
	@Autowired
	ApprovalRestController appRestController;
	
	@Before
	public void initMockMvc() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		mockMvc = MockMvcBuilders.standaloneSetup(appRestController)
								.addFilter(filter)
								.build();
	}
	
	@Ignore
	public void testGetApprovals() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = 
				MockMvcRequestBuilders
							.get("/rest/approvals")
							.accept(MediaType.APPLICATION_JSON);
		
		this.mockMvc.perform(requestBuilder).andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$", Matchers.hasSize(1)))
			.andExpect(jsonPath("$[0].rowId",is("1-AAZZBB")));
	}
	
	@Test
	public void testGetApproval() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = 
				MockMvcRequestBuilders
							.get("/rest/approvals/2-2015020400001")
							.accept(MediaType.APPLICATION_JSON);
		
		this.mockMvc.perform(requestBuilder).andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$.rowId",is("1-AAZZBB")));
		
		print();
	}
}
