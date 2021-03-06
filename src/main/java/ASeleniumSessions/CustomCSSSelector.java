package ASeleniumSessions;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		// Xpath - traverse from top to bottom 
		// Custom CSS - directly hitting that particular node with some custom express that we can write

		 // #id
		 // .classname
		 //  tag#id
		
		//   
		/*
		
		
		#id
		.classname
		 tag#id
		input[id='username'][type='email']
		.classname
		
		whenever three classes are there then remove space and put dot .
		
		.class1.class2.class3
		tag.classname
		
		input.form-control
		.form-control.private-form__control.login-email
		
		
		#username
		input.login-email
		button#loginBtn
		button.private-button
		
		#UIFormControl-label-4
		
		/// text :
		 input[id*='username']    - contains text
		 input[id*='user']
		 input[id^='username']   - starting text
		 input[id$='username']  -  ending text
		 
		 div>input  - parent child
		 div>input[id='username']
		 
		 div.private-form__input-wrapper>input#username
		 
		 xPath - it traverse from top to bottom then find the locators
		 css Selector - it directly jump to required locator that is the reason the css selector is faster
		 
		 
		 
		
		
		
		
		
		*/
		
		
		
		/* 1. id -> htmltag#id, #id
		 * 2. class -> htmltag.classname, .classname, .c1.c2.c3, htmltag.c.c2.c3.....cn
		 * 3. parent>childtag
		 * 
		 * https://guide.blazemeter.com/hc/en-us - practive on it
		 * 
		 * <ul id="categories">
		 * <li class="201429665">
		 * <a class="parent">
		 * <span class="red_trangle"></span>Getting Started</a><ul class="subcat" style="display: none;"><li class="201609089"><a class="parent"><span class="red_trangle"></span><span class="second_parent">The Basics</span></a></li></ul></li><li class="360000211697"><a class="parent"><span class="red_trangle"></span>Functional Testing</a><ul class="subcat" style="display: none;"><li class="360000488118"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Creating Tests</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000700158--GUI-Functional-Testing-Overview--GUI-Functional-Testing-Overview"> GUI Functional Testing - Overview</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002346797-Creating-a-GUI-Test-from-the-UI-Creating-a-GUI-Test-from-the-UI">Creating a GUI Test from the UI</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360003340818-Creating-a-GUI-Functional-Test-From-Predefined-Actions-Creating-a-GUI-Functional-Test-From-Predefined-Actions">Creating a GUI Functional Test From Predefined Actions</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360003970577-Taurus-Actions-for-GUI-Functional-Testing-Taurus-Actions-for-GUI-Functional-Testing">Taurus Actions for GUI Functional Testing</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360003405797-Test-Action-Library-Test-Action-Library">Test Action Library</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360006849317-How-to-Parameterize-Test-Data-in-Scriptless-Tests-How-to-Parameterize-Test-Data-in-Scriptless-Tests">How to Parameterize Test Data in Scriptless Tests</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360006943178-How-to-Parameterize-Tests-How-to-Parameterize-Tests">How to Parameterize Tests</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002346577-Creating-a-GUI-Test-from-a-Java-IDE-Creating-a-GUI-Test-from-a-Java-IDE">Creating a GUI Test from a Java IDE</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002347498-Creating-a-GUI-Test-from-a-Python-IDE-Creating-a-GUI-Test-from-a-Python-IDE">Creating a GUI Test from a Python IDE</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002730618-GUI-Test-Desired-Capabilities-Options-GUI-Test-" desired-capabilities"-options"="">GUI Test "Desired Capabilities" Options</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115003729845-Creating-an-API-Functional-Test-Creating-an-API-Functional-Test">Creating an API Functional Test</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001822857-Scripting-an-API-Functional-Test-in-the-UI-Scripting-an-API-Functional-Test-in-the-UI">Scripting an API Functional Test in the UI</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001835698-Creating-an-API-Functional-Test-via-an-Existing-Script-Creating-an-API-Functional-Test-via-an-Existing-Script">Creating an API Functional Test via an Existing Script</a></li></ul></li><li class="360000519938"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Running Tests</span></a></li><li class="360000488138"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Reporting</span></a></li></ul></li><li class="115000895445"><a class="parent"><span class="red_trangle"></span>Performance Testing</a><ul class="subcat" style="display: none;"><li class="115001649285"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Creating Tests</span></a></li><li class="360000483117"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Running Tests</span></a></li><li class="115001631789"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Reporting</span></a></li><li class="360000563817"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Advanced Test Options</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005911349-Scenario-Definition-Scenario-Definition">Scenario Definition</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005911369-Load-Configuration-Load-Configuration">Load Configuration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005910185-Load-Distribution-Load-Distribution">Load Distribution</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005910205-Failure-Criteria-Failure-Criteria">Failure Criteria</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000262118-End-User-Experience-Monitoring-End-User-Experience-Monitoring">End User Experience Monitoring</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005911509-APM-Integration-APM-Integration">APM Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005918945-JMeter-Properties-JMeter-Properties">JMeter Properties</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005919705-DNS-Override-DNS-Override">DNS Override</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005924849-Network-Emulation-Network-Emulation">Network Emulation</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/207420175-Uploading-Files-Uploading-Files">Uploading Files</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002087717-Shared-Folders-Shared-Folders">Shared Folders</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005920489-Duplicate-Delete-or-Move-a-Test-Duplicate,-Delete,-or-Move-a-Test">Duplicate, Delete, or Move a Test</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732509-Dedicated-IPs-Dedicated-IPs">Dedicated IPs</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000291018-How-To-Configure-an-Ultimate-Thread-Group-Scenario-How-To-Configure-an-Ultimate-Thread-Group-Scenario">How To Configure an Ultimate Thread Group Scenario</a></li></ul></li></ul></li><li class="360000217618"><a class="parent"><span class="red_trangle"></span>Mock Services</a><ul class="subcat" style="display: none;"><li class="360000492078"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Getting Started with Mock Services</span></a></li><li class="360000493958"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Working with Transactions</span></a></li><li class="360000490077"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Creating Mock Services</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001811558-Creating-a-Mock-Service-Creating-a-Mock-Service">Creating a Mock Service</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002046558-Running-a-Mock-Service-Running-a-Mock-Service">Running a Mock Service</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001811618-Adding-a-Mock-Service-to-a-Test-Adding-a-Mock-Service-to-a-Test">Adding a Mock Service to a Test</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001811598-Creating-a-Mock-Service-Template-Creating-a-Mock-Service-Template">Creating a Mock Service Template</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360007682797-Scale-Up-Mock-Service-Performance-Using-Instances-Scale-Up-Mock-Service-Performance-Using-Instances">Scale Up Mock Service Performance Using Instances</a></li></ul></li><li class="360000490097"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Mock Services Tutorials</span></a></li></ul></li><li class="360000223318"><a class="parent"><span class="red_trangle"></span>API Monitoring (Runscope)</a><ul class="subcat" style="display: none;"><li class="360000495617"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Creating Tests</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001835558-Create-Your-First-Test-Create-Your-First-Test">Create Your First Test</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001822677-Validating-Responses-with-Assertions-Validating-Responses-with-Assertions">Validating Responses with Assertions</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001858238-Dynamic-Data-and-Request-Chaining-Dynamic-Data-and-Request-Chaining">Dynamic Data and Request Chaining</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001858258-Managing-Configuration-with-Environments-Managing-Configuration-with-Environments">Managing Configuration with Environments</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001846957-Environment-Headers-and-Authentication-Environment-Headers-and-Authentication">Environment Headers and Authentication</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001858578-Test-Steps-Test-Steps">Test Steps</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001858598-Behaviors-Behaviors">Behaviors</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001846997-Secrets-Management-Secrets-Management">Secrets Management</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001858618-File-Uploads-and-Multipart-Requests-File-Uploads-and-Multipart-Requests">File Uploads and Multipart Requests</a></li></ul></li><li class="360000499598"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Script Engine</span></a></li><li class="360000505598"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Monitoring</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001847217-Global-Locations-Global-Locations">Global Locations</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001847237-Scheduling-Test-Runs-Scheduling-Test-Runs">Scheduling Test Runs</a></li></ul></li><li class="360000502377"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Notifications</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001859058-Notifications-Overview-Notifications-Overview">Notifications Overview</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001861678-Slack-Integration-Slack-Integration">Slack Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002118397-Microsoft-Teams-Integration-Microsoft-Teams-Integration">Microsoft Teams Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001861818-PagerDuty-Integration-PagerDuty-Integration">PagerDuty Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002118297-VictorOps-Integration-VictorOps-Integration">VictorOps Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002131858-OpsGenie-Integration-OpsGenie-Integration">OpsGenie Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001849957-ServiceNow-Integration-ServiceNow-Integration">ServiceNow Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002118257-Flowdock-Integration-Flowdock-Integration">Flowdock Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002131738-Zapier-Integration-Zapier-Integration">Zapier Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002118217-Grove-Integration-Grove-Integration">Grove Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864458-Advanced-Webhooks-Advanced-Webhooks">Advanced Webhooks</a></li></ul></li><li class="360000502397"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Collaboration</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001847257-Build-Deployment-Integration-BuildDeployment-Integration">Build/Deployment Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864538-Sharing-Test-Results-Sharing-Test-Results">Sharing Test Results</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864558-Importing-and-Exporting-Tests-Importing-and-Exporting-Tests">Importing and Exporting Tests</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001852237-Test-Revisions-Test-Revisions">Test Revisions</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002118037-Role-Based-Access-Control-Role-Based-Access-Control">Role-Based Access Control</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001852257-CircleCI-Integration-CircleCI-Integration">CircleCI Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001852277-Codeship-Integration-Codeship-Integration">Codeship Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360005534757-DX-Application-Performance-Management-Integration-CA-APM--DX-Application-Performance-Management-Integration-(CA-APM)">DX Application Performance Management Integration (CA APM)</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864598-CA-API-Management-Integration-CA-API-Management-Integration">CA API Management Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360005528698-Amazon-API-Gateway-Integration-Amazon-API-Gateway-Integration">Amazon API Gateway Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360005534837-Ghost-Inspector-Integration-Ghost-Inspector-Integration">Ghost Inspector Integration</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360005534897-Statuspage-Integration-Statuspage-Integration">Statuspage Integration</a></li></ul></li><li class="360000502417"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Advanced Analytics</span></a></li><li class="360000502437"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Additional Resources</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360002131698-Sample-JSON-Expressions-Sample-JSON-Expressions">Sample JSON Expressions</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001852377-Security-Security">Security</a></li></ul></li><li class="360000502457"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Knowledge Base</span></a></li></ul></li><li class="201409709"><a class="parent"><span class="red_trangle"></span>On-Premise Machines</a><ul class="subcat" style="display: none;"><li class="202477049"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Introduction</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732599-Private-Locations-Private-Locations">Private Locations</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/207420375-Cloud-vs-Private-Location-vs-Private-Cloud-Cloud-vs-Private-Location-vs-Private-Cloud">Cloud vs Private Location vs Private Cloud</a></li></ul></li><li class="360000570197"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Installation</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/209186065-Private-Location-System-Requirements-Private-Location-System-Requirements">Private Location System Requirements</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/207421655-Creating-a-Private-Location-Creating-a-Private-Location">Creating a Private Location</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206733949-Installing-the-Agent-Installing-the-Agent">Installing the Agent</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360004821337-Kubernetes-Installation-Steps-Kubernetes-Installation-Steps">Kubernetes Installation Steps</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115005639765-Optional-Installation-Step-Configuring-Private-Location-s-Agents-To-Use-a-Corporate-Proxy-Optional-Installation-Step:-Configuring-Private-Location's-Agents-To-Use-a-Corporate-Proxy">Optional Installation Step: Configuring Private Location's Agents To Use a Corporate Proxy</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000388697-Optional-Installation-Step-Configuring-an-Installation-to-Use-CA-Bundle-Optional-Installation-Step:-Configuring-an-Installation-to-Use-CA-Bundle">Optional Installation Step: Configuring an Installation to Use CA Bundle</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360007076338-Optional-Installation-Step-Bring-Your-Own-Certificate-Mock-Services-Optional-Installation-Step:-Bring-Your-Own-Certificate-–-Mock-Services">Optional Installation Step: Bring Your Own Certificate – Mock Services</a></li></ul></li><li class="360000850757"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Managing and Removing Installation</span></a></li><li class="360000960858"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Radar Agent</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001859038-Radar-Agent-Overview-Radar-Agent-Overview">Radar Agent Overview</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360005562057-Handling-Radar-Agent-Availability-Issues-Handling-Radar-Agent-Availability-Issues">Handling Radar Agent Availability Issues</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001852557-Radar-Agent-Connection-Errors-Radar-Agent-Connection-Errors">Radar Agent Connection Errors</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864898-Remote-Agent-Expired-Remote-Agent-Expired">Remote Agent Expired</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864878-Radar-Agent-SSO-Login-Error-Radar-Agent-SSO-Login-Error">Radar Agent SSO Login Error</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864858-Radar-Agent-HTTP-HTTPS-Proxy-Setup-Radar-Agent-HTTPHTTPS-Proxy-Setup">Radar Agent HTTP/HTTPS Proxy Setup</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864838-Running-the-Radar-Agent-as-a-Service-or-Daemon-Running-the-Radar-Agent-as-a-Service-or-Daemon">Running the Radar Agent as a Service or Daemon</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001864818-Radar-Agent-High-Availability-Failover-Capability-Radar-Agent-High-Availability-Failover-Capability">Radar Agent High Availability / Failover Capability</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360001852577-Supported-SSL-CA-Certificates-for-Radar-Agent-Supported-SSL-CA-Certificates-for-Radar-Agent">Supported SSL CA Certificates for Radar Agent</a></li></ul></li><li class="202768605"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Private Location Knowledge Base</span></a></li></ul></li><li class="201420149"><a class="parent"><span class="red_trangle"></span>Blazemeter's API</a><ul class="subcat" style="display: none;"><li class="202683465"><a class="parent"><span class="red_trangle"></span><span class="second_parent">General Information</span></a></li><li class="360000088978"><a class="parent"><span class="red_trangle"></span><span class="second_parent">V4 Updated Create and Run Tests</span></a></li><li class="201664005"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Create And Run Tests</span></a></li><li class="202627929"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Retrieve Logs</span></a></li><li class="115000524965"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Tests Scheduler</span></a></li></ul></li><li class="360001227518"><a class="parent"><span class="red_trangle"></span>BlazeMeter University</a><ul class="subcat" style="display: none;"><li class="360002094518"><a class="parent"><span class="red_trangle"></span><span class="second_parent">User Management</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360007176317-The-different-user-types-in-BlazeMeter-University-The-different-user-types-in-BlazeMeter-University">The different user types in BlazeMeter University</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360007095198-How-to-invite-and-create-users-in-the-BlazeMeter-University-How-to-invite-and-create-users-in-the-BlazeMeter-University">How to invite and create users in the BlazeMeter University</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360006984677-How-to-manage-course-enrollments-in-the-BlazeMeter-University-How-to-manage-course-enrollments-in-the-BlazeMeter-University">How to manage course enrollments in the BlazeMeter University</a></li></ul></li></ul></li><li class="360000199397"><a class="parent"><span class="red_trangle"></span>Auto-Scripting Recorders</a><ul class="subcat" style="display: none;"><li class="201609099"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Chrome Extension</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732579-The-BlazeMeter-Chrome-Extension-Record-JMeter-Selenium-or-Synchronized-JMeter-and-Selenium-The-BlazeMeter-Chrome-Extension:-Record-JMeter,-Selenium,-or-Synchronized-JMeter-and-Selenium">The BlazeMeter Chrome Extension: Record JMeter, Selenium, or Synchronized JMeter and Selenium</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732849-Chrome-Extension-Record-Chrome-Extension-Record">Chrome Extension - Record</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/115004970329-Chrome-Extension-Changelog-Chrome-Extension-Changelog">Chrome Extension - Changelog</a></li></ul></li><li class="360000092117"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Proxy Recorder</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000271458-Creating-the-Proxy-Recorder-Creating-the-Proxy-Recorder">Creating the Proxy Recorder</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000306117-Setting-Port-Range-On-Your-Ships-Setting-Port-Range-On-Your-Ships">Setting Port Range On Your Ships</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000285357-Recording-Using-Android-Devices-Recording-Using-Android-Devices">Recording Using Android Devices</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000285377-Recording-Using-Apple-Devices-Recording-Using-Apple-Devices">Recording Using Apple Devices</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000285397-Recording-Using-Firefox-Recording-Using-Firefox">Recording Using Firefox</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000271478-Recording-Using-Chrome-Recording-Using-Chrome">Recording Using Chrome</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000271498-Using-the-Other-Certificate-Using-the-Other-Certificate">Using the Other Certificate</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000285437-Recording-Your-Session-Recording-Your-Session">Recording Your Session</a></li></ul></li></ul></li><li class="201442085"><a class="parent"><span class="red_trangle"></span>Integrations &amp; Plugins</a><ul class="subcat" style="display: none;"><li class="360000443617"><a class="parent"><span class="red_trangle"></span><span class="second_parent">CI/CD</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360004191957-Testing-via-Azure-DevOps-Pipeline-Testing-via-Azure-DevOps-Pipeline">Testing via Azure DevOps Pipeline</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732669-BlazeMeter-s-Jenkins-Plugin-A-Guide-BlazeMeter's-Jenkins-Plugin-A-Guide">BlazeMeter's Jenkins Plugin - A Guide</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/207420395-BlazeMeter-s-TeamCity-plugin-BlazeMeter's-TeamCity-plugin">BlazeMeter's TeamCity plugin</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206733419-BlazeMeter-Plugin-to-Bamboo-BlazeMeter-Plugin-to-Bamboo">BlazeMeter Plugin to Bamboo</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732759-Testing-via-AWS-CodePipeline-Testing-via-AWS-CodePipeline">Testing via AWS CodePipeline</a></li></ul></li><li class="202472329"><a class="parent"><span class="red_trangle"></span><span class="second_parent">APM Integrations</span></a></li><li class="360000473157"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Single Sign-On (SSO)</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/208578485-SAML-SSO-Integration-SAML-SSO-Integration">SAML SSO Integration</a></li></ul></li></ul></li><li class="201442065"><a class="parent"><span class="red_trangle"></span>Blazemeter Settings</a><ul class="subcat" style="display: none;"><li class="201663895"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Account Settings</span></a></li><li class="360000473137"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Workspace Settings</span></a></li><li class="360000974017"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Team Settings</span></a></li><li class="360000476978"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Personal Settings</span></a></li></ul></li><li class="360000226657"><a class="parent"><span class="red_trangle"></span>Billing</a><ul class="subcat" style="display: none;"><li class="202684605"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Subscriptions</span></a></li><li class="360000519878"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Credits</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/360000271978-BlazeMeter-s-Credit-Types-and-How-They-are-Charged-BlazeMeter's-Credit-Types-and-How-They-are-Charged">BlazeMeter's Credit Types and How They are Charged</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732779-How-Many-Credits-Will-My-Test-Use--How-Many-Credits-Will-My-Test-Use?">How Many Credits Will My Test Use?</a></li></ul></li></ul></li><li class="201420989"><a class="parent"><span class="red_trangle"></span>Knowledge Base</a><ul class="subcat" style="display: none;"><li class="201663905"><a class="parent"><span class="red_trangle"></span><span class="second_parent">How To's</span></a></li><li class="360000454158"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Common Problems</span></a></li><li class="360000459038"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Taurus</span></a></li><li class="360000451937"><a class="parent"><span class="red_trangle"></span><span class="second_parent">JMeter</span></a></li></ul></li><li class="360000229718"><a class="parent"><span class="red_trangle"></span>Support &amp; Feature Requests</a><ul class="subcat" style="display: none;"><li class="360000453477"><a class="parent"><span class="red_trangle"></span><span class="second_parent"> Contacting Blazemeter</span></a></li></ul></li><li class="201420169"><a class="parent"><span class="red_trangle"></span>Legacy (V3) Tests &amp; Reports</a><ul class="subcat" style="display: none;"><li class="201609109"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Creating Tests</span></a><ul class="subcategory" style="display: none;"><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732819-Creating-a-Legacy-JMeter-Test-Creating-a-Legacy-JMeter-Test">Creating a Legacy JMeter Test</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732829-Creating-a-Legacy-URL-API-Test-in-BlazeMeter-Creating-a-Legacy-URLAPI-Test-in-BlazeMeter">Creating a Legacy URL/API Test in BlazeMeter</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732869-Legacy-Multi-Test-Legacy-Multi-Test">Legacy Multi Test</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/206732889-Free-Sandbox-Tests-Free-Sandbox-Tests">Free Sandbox Tests</a></li><li><a class="article_link" href="https://guide.blazemeter.com/hc/en-us/articles/207420305-How-To-Configure-Ultimate-Stepping-Thread-Groups-Scenario-Legacy-JMeter-Test--How-To-Configure-UltimateStepping-Thread-Groups-Scenario-(Legacy-JMeter-Test)">How To Configure Ultimate/Stepping Thread Groups Scenario (Legacy JMeter Test)</a></li></ul></li><li class="201663885"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Running Tests</span></a></li><li class="201609169"><a class="parent"><span class="red_trangle"></span><span class="second_parent">Understanding Reports </span></a></li></ul></li></ul>
		 * ul#categories
		 * 
		 * div.clearfix
		 * 
		 * .article-meta
		 * 
		 * Cascaded class name
		 * .article-header.clearfix
		 * 
		 * .logo
		 * .header-inner
		 * 
		 * 
		 * https://app.hubspot.com/login
		 * #username
		 * input#username
		 * 
		 * Three class name cascaded name - 
		 * 
		 * input.form-control.private-form__control.login-email
		 * 
		 * id and classname together-
		 * 
		 * input#username.form-control.private-form__control.login-email
		 * input.login-email
		 * 
		 * 
		 * htmltag[id='value']
		 * input[id='username']    - CSS with one attribute
		 * //input[@id='username'] - Xpath
		 * 
		 * 
		 * input[id='username'] [type='email'] - css with two attribute
		 * //input[@id='username' and @type='email'] - xpath with two attribute
		 * 
		 * 5. Contains the text in CSS- 
		 * 
		 * input[id* = 'user']
		 * input[id* = 'name']
		 * 
		 * dynamic id's
		 * id = test_123
		 * test_2344
		 * test_456
		 * 
		 * input[id*='test_']
		 * 
		 * 6. Starting the text in css:
		 * input[id^ = 'user']
		 * 
		 * 7. ending the text in css
		 * input[id$ ='name']
		 * 
		 * 8. Comma In CSS : between css operator
		 * div.private-form__input-wrapper,input[id='username']
		 * 
		 * 9. first-of-type in CSS: in this page - https://guide.blazemeter.com/hc/en-us
		 * 
		 * ul#categories>li  - 1 of 14 - this will give 14
		 * ul#categories>li:first-of-type  - it will give you first of type
		 * 
		 * 10. 
		 * ul#categories>li:last-of-type - it will give you last of type
		 * 
		 * 11. nth-of-type
		 * ul#categories>li:nth-of-type(1)
		 * ul#categories>li:nth-of-type(2)
		 * ul#categories>li:nth-of-type(3)
		 * ul#categories>li:nth-of-type(4)
		 * ul#categories>li:nth-of-type(5)
		 * 
		 * ul#categories>li:nth-of-type(n) - it will give you all the element where n= 1,2,4 or if n then for all the elements
		 * -all
		 * 
		 * 
		 * 12--- sibling of element
		 * hubspot.com/login
		 * sibling of element---
		 * ------------------
		 * 
		 * div.private-form__input-wrapper+div
		 * div.private-form__input-wrapper+div.private-form__meta
 		 *      
		 * ul#categories>li:nth-of-type(3)+li
		 * 
		 * 
		 * 13. not operator in CSS
		 * 
		 * input.form-control.private-form__control:not(.login-email)
		 * input.form-control.private-form__control:not(.login-password)
		 * 
		 * Advantages of CSS over xPath are:
---------------------------------

1) Css Selector will not change browser to browser as xpath will change.

2) CSS is native to browsers and xPath is not

3) xPath engines are different in each browser,hence make them inconsistent


By using below methods we are identify the elements uniquely.

1) TagName
2) Id (#)
3) ClassName (.)
4) Attributes
5) Contains (*)
6) Starts-with (^)
7) Ends with ($)
8) Direct Childs  or Sub-Child Elements
9) Next Sibling
10) PSEUDO-CLASSES -  FIRST-CHILD, LAST-CHILD, NTH-CHILD(), NTH-LAST-CHILD()


1) TagName:
   ---------
   Using tag name we can identify the element. But it will locate so many elements on the web page. as page may have same tags in many places,So it will not locate the element uniquely.This is not a good practice to use the tag name individually to locate the element.


2) ID:
   ---
Id is an attribute to the element or tag to describe what kind of element that is.Id's are unique. If you want to use ID as locator then need to use '#' symbol in front of ID.

syntax:  tagName#IDValue  (or)  #IDValue  (or) tagName[Attribute='value']


3) Class Name:
   -----------
Class is also an attribute to the element to apply the styles to that tag/element.Class names are not unique.So,if use these it locate so many elements which are using the same class.If you want to locate an element using class name use any other attributes as extra parameters to identify the element uniquely.
If you want to use Class NAme as locator then need to use '.' symbol in front of class Name

syntax:  tagName.className   (or)  .className  (or)  tagName[Attribute='value']


4) Multiple Attributes:
   --------------------
We can use multiple attributes to identify the element.

syntax:    tagName[attribute1='attributeValue1'][attribute2='attributeValue2']


5) Contains:
   ---------
We can use contains method to identify the element.Need to use  '*' symbol to identify the element.

syntax  :  tagName[attribute*='partialAttributeValue']


6) Starts With:
   ------------
We can use starts with method to identify the element .Need to use '^' (cap)symbol to identify the element.

syntax:
-------
tagName[attribute^='attributeStartingValue']


7) Ends With:
   ----------

We can use ends with method to identify the element.Need to use '$' symbol to identify the element.

syntax:
-------
tagName[attribute$='attributeEndingValue']



8) Direct Childs  or Sub-Child Elements
   ------------------------------------

Direct Child :
    1) Child Combinator(>) is used to select direct child
       syntax : tagName[AttributeName='AttributeValue'] > tagName[AttributeName='AttributeValue']

    2) Descendant combinator () is used to select child or SubChild
       syntax : tagName[AttributeName='AttributeValue']  tagName[AttributeName='AttributeValue']



9) Next Sibling
   ------------

Sibling  elements are located using the  + operator
Adjacent sibling combinator(+) separates two CSS selectors and matches the second webelement only if it immidiately follows the first webelement, and both are the child of the same parent webelement

    syntax : tagName[AttributeName='AttributeValue']+tagName[AttributeName='AttributeValue']



10) PSEUDO-CLASSES - FIRST-CHILD, LAST-CHILD, NTH-CHILD, NTH-LAST-CHILD
    -------------------------------------------------------------------

    A CSS pseudo class is a  keyword added a selector that specifies a special state of the                selected webelement.


    . first-child    -> Returns first element from the group of sibling elements.

    . last-child     -> Returns last element from the group of sibling elements.

    . nth-child()    -> Returns elements based on their position in a group of                                                 siblings.

    . nth-last-child()  -> Returns elements based on their posotion among a group of                                              siblings, counting from the end.
		 * 
		 * 
		 */
		
		
		
	}
		

}
