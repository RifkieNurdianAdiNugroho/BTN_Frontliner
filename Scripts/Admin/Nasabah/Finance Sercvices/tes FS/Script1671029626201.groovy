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

WebUI.setText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Nasabah'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Financing Service'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Filter'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Submit'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Filter_svg-icon svg-icon-2'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Submit'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Filter'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Submit'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Filter'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Submit'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Submit'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Filter'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/span_Select option'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Data_form-control form-control-solid _bdc5aa'), 
    'pa')

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_Multiguna'))

WebUI.setText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Data_form-control form-control-solid _bdc5aa'), 
    'tess')

WebUI.doubleClick(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_tessa'))

WebUI.setText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Data_form-control form-control-solid _bdc5aa'), 
    'ser')

WebUI.doubleClick(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_Multiguna'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_Multiguna'))

WebUI.click(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_sera'))

WebUI.setText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Data_form-control form-control-solid _bdc5aa'), 
    'fre')

WebUI.doubleClick(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_frera'))

WebUI.setText(findTestObject('Object Repository/Admin/Nasabah/Finance Service/input_Data_form-control form-control-solid _bdc5aa'), 
    'akin')

WebUI.doubleClick(findTestObject('Object Repository/Admin/Nasabah/Finance Service/td_akina'))

WebUI.closeBrowser()

