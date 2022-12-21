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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/input_Email_email'), ' manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_HOT'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/td_marketing funding'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/td_Diana McDonald'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/td_pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Diana McDonald - personal - nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Diana McDonald - personal - nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/td_Created at 335 PM 11082022'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/td_funding'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_regina - personal - nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit_1_2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit_1_2_3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/div_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Hot/filter/a_Edit_1_2_3_4'))

WebUI.closeBrowser()

