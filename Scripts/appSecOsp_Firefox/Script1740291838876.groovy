import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

// Execute JavaScript Click
JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

WebUI.setText(findTestObject('Page_AppSecOps/Page_Login/loginUsername'), 'newtestorg@intrucept.com')

WebUI.setEncryptedText(findTestObject('Page_AppSecOps/Page_Login/loginPassword'), 'gnBCy2/FAyRL+oF8HjSJ9w==')

WebUI.click(findTestObject('Page_AppSecOps/Page_Login/loginButton'))

WebDriver driver = DriverFactory.getWebDriver()

((JavascriptExecutor) driver).executeScript("document.body.style.zoom='70%'")

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_BusinessUnit/page_BusinessUnits'))

WebUI.click(findTestObject('Page_AppSecOps/Page_BusinessUnit/page_Add Business Unit'))

WebUI.setText(findTestObject('Page_AppSecOps/Page_BusinessUnit/input_Business Unit Name'), 'Business Unit')

WebUI.click(findTestObject('Page_AppSecOps/Page_BusinessUnit/button_Save Business Unit'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_AssetGroup/page_Asset Groups'))

WebUI.click(findTestObject('Page_AppSecOps/Page_AssetGroup/page_Add Asset Group'))

WebUI.setText(findTestObject('Page_AppSecOps/Page_AssetGroup/input_Asset Group Name'), 'Asset Group')

WebUI.click(findTestObject('Page_AppSecOps/Page_AssetGroup/button_Save Asset Group'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_User/page_Users'))

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_User/Add a User'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_User/Add a User')))

WebUI.selectOptionByIndex(findTestObject('Page_AppSecOps/Page_User/select_UserRole'), 1)

WebUI.setText(findTestObject('Page_AppSecOps/Page_User/input_First Name'), 'QA First')

WebUI.setText(findTestObject('Page_AppSecOps/Page_User/input_Last Name'), 'QA Last')

WebUI.setText(findTestObject('Page_AppSecOps/Page_User/input_Email'), 'intrucept_user@hotmail.com')

WebUI.setEncryptedText(findTestObject('Page_AppSecOps/Page_User/input_Password'), 'gnBCy2/FAyRL+oF8HjSJ9w==')

WebUI.scrollToElement(findTestObject('Page_AppSecOps/Page_User/button_Save User'), 3)

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_User/select_phoneCode'), 'India', false)

WebUI.setText(findTestObject('Page_AppSecOps/Page_User/input_Phone Number'), '9087654320')

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_User/select_Business Unit'), 'Business Unit', false)

WebUI.setText(findTestObject('Page_AppSecOps/Page_User/input_Location'), 'QA Location')

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_User/button_Save User'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_User/button_Save User')))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_Application/page_Applications'))

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Application/Add an Application'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Application/Add an Application')))

WebUI.setText(findTestObject('Page_AppSecOps/Page_Application/input_Application Name'), 'Desktop Application')

WebUI.selectOptionByIndex(findTestObject('Page_AppSecOps/Page_Application/select_Applicationtype'), 2)

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_Application/select_BusinessUnit'), 'Business Unit', false)

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_Application/select_AssetGroup'), 'Asset Group', false)

WebUI.selectOptionByIndex(findTestObject('Page_AppSecOps/Page_Application/select_BusinessOwner'), 1)

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_Application/select_BusinessImpact'), 'CRITICAL', false)

WebUI.scrollToElement(findTestObject('Page_AppSecOps/Page_Application/button_Save Application'), 5)

WebUI.setText(findTestObject('Page_AppSecOps/Page_Application/textarea_Description'), 'Test Description firefox')

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Application/button_Save Application'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Application/button_Save Application')))

WebUI.delay(3)

WebUI.click(findTestObject('Page_AppSecOps/Page_SAST Scan/page_SAST Scans'))

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_SAST Scan/Start a SAST Scan'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_SAST Scan/Start a SAST Scan')))

WebUI.setText(findTestObject('Page_AppSecOps/Page_SAST Scan/input_Scan Name'), 'SAST llama_C-lang')

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_SAST Scan/select_Select Application'), 'Desktop Application', 
    false)

WebUI.uploadFile(findTestObject('Page_AppSecOps/Page_SAST Scan/input_Upload the project zip'), 'C:\\Users\\Intru009\\Desktop\\Intrucept\\Intrucept\\POC\\ASOscanfiles\\llama2.c-master.zip')

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_SAST Scan/button_Start SAST Scan'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_SAST Scan/button_Start SAST Scan')))

WebUI.delay(5)

// Define the Test Object for the status element
TestObject currentstatus = findTestObject('Page_AppSecOps/Page_status/SCA_COMPLETED' // Update with your actual object
    )

// Maximum wait time in seconds
int waitingTime = 60

int interwel = 5 // Check every 5 seconds

int elapsedTime = 0

// Loop to check status every 'interval' seconds
while (elapsedTime < waitingTime) {
    String statusText = WebUI.getText(currentstatus // Get the current status text
        )

    if (statusText == 'COMPLETED') {
        break
    }
    
    WebUI.delay(interwel // Wait for the interval before checking again
        )

    elapsedTime += interwel
}

WebUI.click(findTestObject('Page_AppSecOps/Page_SAST Scan/button_SASTView Report'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_SAST Scan/button_Back to SAST Scans List'))

WebUI.click(findTestObject('Page_AppSecOps/Page_SCA Scan/page_SCA Scans'))

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_SCA Scan/Start a SCA Scan'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_SCA Scan/Start a SCA Scan')))

WebUI.setText(findTestObject('Page_AppSecOps/Page_SCA Scan/input_Scan Name'), 'SCA_Goatlin_Kotlin')

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_SCA Scan/select_select Application'), 'Desktop Application', 
    false)

WebUI.uploadFile(findTestObject('Page_AppSecOps/Page_SCA Scan/input_Upload the project zip'), 'C:\\Users\\Intru009\\Desktop\\Intrucept\\Intrucept\\POC\\ASOscanfiles\\Goatlin-Kotlin-main.zip')

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_SCA Scan/button_Start SCA Scan'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_SCA Scan/button_Start SCA Scan')))

WebUI.delay(5)

// Define the Test Object for the status element
TestObject status = findTestObject('Page_AppSecOps/Page_status/SCA_COMPLETED' // Update with your actual object
    )

// Maximum wait time in seconds
int waitTime = 60

int interv = 5 // Check every 5 seconds

int elapsed = 0

// Loop to check status every 'interval' seconds
while (elapsed < waitTime) {
    String statText = WebUI.getText(status // Get the current status text
        )

    if (statText == 'COMPLETED') {
        break
    }
    
    WebUI.delay(interv // Wait for the interval before checking again
        )

    elapsed += interv
}

WebUI.click(findTestObject('Page_AppSecOps/Page_SCA Scan/button_SCA View Report'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_SCA Scan/button_Back to SCA Scans List'))

WebUI.click(findTestObject('Page_AppSecOps/Page_Ticket/page_Tickets'))

WebUI.scrollToPosition(700, 0)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Ticket/in_Viewticket'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Ticket/in_Viewticket')))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Ticket/in_Closeviewticket'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Ticket/in_Closeviewticket')))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Ticket/add_Open a New Ticket'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Ticket/add_Open a New Ticket')))

WebUI.setText(findTestObject('Page_AppSecOps/Page_Ticket/input__Ticket title'), 'Firefox Manual Ticket')

WebUI.selectOptionByIndex(findTestObject('Page_AppSecOps/Page_Ticket/select_Ticket category'), 1)

WebUI.selectOptionByLabel(findTestObject('Page_AppSecOps/Page_Ticket/select_Priority'), 'Medium', false)

WebUI.setText(findTestObject('Page_AppSecOps/Page_Ticket/textarea_Description'), 'Firefox Manual ticket description')

WebUI.selectOptionByIndex(findTestObject('Page_AppSecOps/Page_Ticket/select_Assigned To'), 1)

WebUI.scrollToElement(findTestObject('Page_AppSecOps/Page_Ticket/button_Submit Ticket'), 5)

WebUI.uploadFile(findTestObject('Page_AppSecOps/Page_Ticket/input_Add Files'), 'C:\\Users\\Intru009\\Desktop\\Intrucept\\Intrucept\\sample_files\\SampleCSVFile_2kb.csv')

WebUI.setText(findTestObject('Page_AppSecOps/Page_Ticket/textarea_Note'), 'Firefox Automation Notes')

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Ticket/button_Submit Ticket'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Ticket/button_Submit Ticket')))

WebUI.delay(2)

WebUI.scrollToPosition(700, 0)

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Ticket/in_Viewticket'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Ticket/in_Viewticket')))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Ticket/in_Closeviewticket'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Ticket/in_Closeviewticket')))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AppSecOps/Page_Dashboard/page_Dashboard'))

WebUI.scrollToElement(findTestObject('Page_AppSecOps/Page_Dashboard/span_TOP 10 VULNERABLE APPLICATIONS'), 5)

WebUI.scrollToElement(findTestObject('Page_AppSecOps/Page_Dashboard/span_CWE TOP 25 MOST DANGEROUS SOFTWARE ERRORS'), 5)

WebUI.scrollToElement(findTestObject('Page_AppSecOps/Page_Dashboard/span_APPLICATION FINDINGS (DISCOVERED VS RESOLVED)'), 
    5)

WebUI.scrollToPosition(0, 99999)

WebUI.waitForElementClickable(findTestObject('Page_AppSecOps/Page_Dashboard/button_Daily'), 10)

js.executeScript('arguments[0].click();', WebUI.findWebElement(findTestObject('Object Repository/Page_AppSecOps/Page_Dashboard/button_Daily')))

WebUI.delay(2)

WebUI.closeBrowser()

