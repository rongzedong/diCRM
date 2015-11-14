package com.di.amqp;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

/**
 * FileUpload is the basic operation in the web app.
 * But it has some problems in the web environment. 
 * Most cases it develops using jquery in the async environment.
 * 
 * But client request can't control completely.
 * It looks like boomb!! How can many people try to upload concurrently?
 * 
 * If the server can control the action completely,
 * - using message queue -
 * I think the system is more robust, maybe...
 *
 * 1) user request the file upload(with file's location)
 * 2) the request register in the queue(not the file)
 * 3) background client's module start to send file information
 * 4) after upload finish, tell the client(if he connect..)
 *    or send the email
 * 
 * @author hyun
 *
 */
public class testAsyncFileUploadManager {

	/*
	private FileUploadRequest request = null;
	private ClientFileManager client = null;
	private ServerFileManager server = null;
	
	private CallBackFunction uploadCallBack = null;
	
	@Before
	public void setUp() {
		request = new FileUploadRequest();
		client = new ClientFileManager();
		server = new ServerFileManager();
		
		uploadCallBack = new FileUploadCallBack();
		uploadCallBack.callback();
	}
	
	@Test
	public void testAddRequestUpload() {
		client.registerCallBack(uploadCallBack);
		
		Connect connect = client.connectToServer();
		server.register(connect, client);
		
		assertThat(server.search(client), is(client));
		assertThat(client.getStatus(), is(FileUpload.readyStatus()));
	}
	
	@Test
	public void testFileUploadServerSide() {
		server.checkQueue();
		server.run();
		
		//TODO : 일정시간동안 지연필요? ASYNC 실행을 어떻게 테스트??
	}
	*/
}
