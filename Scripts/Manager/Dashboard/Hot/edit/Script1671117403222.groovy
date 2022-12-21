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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_HOT'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_Luluk Mufida -                        _016d2b'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/div_Marketing'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Edit_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_Marketing Pembiayaan -                _9d6040'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_sera - badan_usaha - non_nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_sera - badan_usaha - non_nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Back'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_HOT'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/div_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/a_Edit_1_2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_Marketing Pembiayaan -                _9d6040_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/span_jali - badan_usaha - non_nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/edit/button_Submit                              _00b7a5'))

WebUI.closeBrowser()

