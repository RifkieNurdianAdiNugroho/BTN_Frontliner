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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/div_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/a_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/path'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/path'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'pu')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_putri'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Filter_svg-icon svg-icon-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'ade')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_ade'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'fre')

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_frera'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'alex')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_Alexander Campbell'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'tes3')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_Marketing Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'boris')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/th_Nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_Boris Forsyth'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/div_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'ater')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/filter/td_atera'))

WebUI.closeBrowser()

