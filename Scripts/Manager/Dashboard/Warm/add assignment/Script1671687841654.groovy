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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/a_Warm'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/a_Add Assignment'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Pilih Marketing'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Pilih Nasabah'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Rose Blake'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_marketing pembiayaan - financing'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_ascsa - funding'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Madeleine Rees'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Madeleine Rees'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Add Assignment_svg-icon svg-icon-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/a_Back'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/input_List Nasabah_form-control form-contro_b66241'), 
    'market funding')

WebUI.sendKeys(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/input_List Nasabah_form-control form-contro_b66241'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/select_102550100'), '100', 
    true)

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/a_Add Assignment'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/span_Pilih Marketing_1'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/input_List Nasabah_form-control form-contro_b66241'), 
    'financing')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/th_Created At'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Manager/Dashboard/Warm/Add Assingment/select_102550100'), '25', 
    true)

WebUI.closeBrowser()

