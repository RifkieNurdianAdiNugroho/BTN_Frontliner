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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/span_Marketing'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Marketing_form-control form-control-s_c5313c'), 
    'fundingtes')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/td_fundingtes141414'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/svg'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Marketing_form-control form-control-s_c5313c'), 
    'emma')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/svg'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Marketing_form-control form-control-s_c5313c'), 
    'ascs')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/a_Actions'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Marketing_form-control form-control-s_c5313c'), 
    'me')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/svg_1'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Marketing_form-control form-control-s_c5313c'), 
    '')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/Search/select_102550100'), '100', 
    true)

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Search/input_Marketing_form-control form-control-s_c5313c'), 
    'sue')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Search/div_Add User'))

WebUI.closeBrowser()

