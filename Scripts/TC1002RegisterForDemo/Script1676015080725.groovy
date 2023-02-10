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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nxtgenaiacademy.com/demo-site/')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input__vfb-5'), 'Niti')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input__vfb-7'), 'Surakongka')

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Gender_vfb-31'))

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Address_vfb-13address'), '147/1')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Street Address_vfb-13address-2'), 
    'แสงชูโตใหม่')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Apt, Suite, Bldg. (optional)_vfb-13city'), 
    'ท่ามะกา')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_City_vfb-13state'), 'กาญจนบุรี')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_State  Province  Region_vfb-13zip'), 
    '71130')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input__vfb-14'), '644259031')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Date of Demo_vfb-18'), '02/10/2023')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Mobile Number_vfb-19'), '0917582874')

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Course Interested_vfb-20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Selenium WebDriver_vfb-20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_UFT_vfb-20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_TestNG_vfb-20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Core Java_vfb-20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_Functional Testing_vfb-20'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/textarea_Enter your query_vfb-23'), 
    'Mid_Niti031')

WebUI.setText(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input__vfb-3'), '99')

WebUI.click(findTestObject('Page_Demo Site  Registration Form  NxtGen A.I Academy/input_This box is for spam protection - strongplease leave it blankstrong_vfb-submit'))

WebUI.verifyTextPresent('Please enter a valid email address.', false)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.closeBrowser()

