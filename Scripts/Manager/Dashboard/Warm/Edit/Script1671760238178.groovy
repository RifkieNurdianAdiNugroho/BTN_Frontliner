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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/a_Warm'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Created at 515 PM 11122022_svg-icon sv_324f17'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Marketing2P -                         _5893f9'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_gladis - personal - non_nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/a_Back'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/td_Created at 912 PM 10192022'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Tipe'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/label_Berdasarkan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Sumber Data'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Jenis'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/a_Edit_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_Marketing2P -                         _5893f9'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/span_glados - personal - nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/button_Submit                              _00b7a5'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/input_List Nasabah_form-control form-contro_b66241'), 
    'are')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/td_Marketing Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/td_arey'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/edit/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.closeBrowser()

