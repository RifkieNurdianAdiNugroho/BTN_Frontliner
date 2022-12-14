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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_Email_email'), ' manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/a_Assignment'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_List Nasabah_form-control form-contro_b66241'), 
    'dimas')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_funding'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_closed'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_List Nasabah_form-control form-contro_b66241'), 
    'jac')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_hot'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Personal'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Teller'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_List Nasabah_form-control form-contro_b66241'), 
    'sera')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Marketing Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Financing Service'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_List Nasabah_form-control form-contro_b66241'), 
    'came')

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Cameron Ball'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Cameron Ball'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/input_List Nasabah_form-control form-contro_b66241'), 
    'robert i')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Robert Ince'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Assignment/search/td_Luluk Mufida'))

WebUI.closeBrowser()

