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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/span_Log Activity'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Log Activity_form-control form-contro_01cdb9'), 
    'teller')

WebUI.sendKeys(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Log Activity_form-control form-contro_01cdb9'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Log Activity_form-control form-contro_01cdb9'), 
    'cus')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Customer Service User restfultes'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_192.168.0.1'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_update'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_2022-11-09 151630'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Customer Service Submission sera'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/tbody_4                                    _bf7810'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Customer Service Submission sera'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Log Activity_form-control form-contro_01cdb9'), 
    'marketing')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Marketing User -----'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Marketing User tesalonika'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Marketing User tesalonika'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Marketing User ascsa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Log Activity_form-control form-contro_01cdb9'), 
    'dim')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Teller Submission dimas'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Teller Submission dimas'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Log Activity/input_Log Activity_form-control form-contro_01cdb9'), 
    'ze')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Log Activity/td_Manager User zegg'))

WebUI.closeBrowser()

