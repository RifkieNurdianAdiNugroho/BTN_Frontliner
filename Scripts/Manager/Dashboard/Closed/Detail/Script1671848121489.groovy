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

WebUI.navigateToUrl('https://frontliner.intermediatech.id/')

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/a_Detail'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_DATE'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_STATUS'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/a_Closed'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/a_Detail_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_NOTE'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_DATE'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_TITLE'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_TITLE'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/div_Closed'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/a_Closed'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/input_List Nasabah_form-control form-contro_b66241'), 
    'aqil')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/td_aqil'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/div_No                                    N_06f1eb'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/detail/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.closeBrowser()

