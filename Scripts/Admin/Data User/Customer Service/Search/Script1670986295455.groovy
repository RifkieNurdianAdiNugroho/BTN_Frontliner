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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/span_Customer Service'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    'tes')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/td_tesacel'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    'tesace')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/td_tesacel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/td_12345678'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/svg'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    'ad')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/div_Add User                               _7a3062'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    'tes5')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    'cus')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    '')

WebUI.closeBrowser()

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/search/input_Customer Service_form-control form-co_a897dd'), 
    '')

