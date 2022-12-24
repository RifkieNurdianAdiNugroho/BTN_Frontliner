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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/a_Closed'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_closed'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Teller'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Luluk Mufida'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Nathan Peake'))

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Nathan Peake'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_closed'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_closed'))

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_closed'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Personal'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Marketing Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_aqil'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/div_List Nasabah                           _972ccd'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/div_List Nasabah                           _972ccd'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'closed')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Nathan Peake'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/span_Select option_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'clos')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_bana'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Customer Service'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Closed/filter/td_Customer Service'))

WebUI.closeBrowser()

