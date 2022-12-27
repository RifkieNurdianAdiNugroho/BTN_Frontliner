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

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Service/search/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Customer Service/search/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/button_Masuk                               _2fbfc3'))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'and')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'and')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'putri')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'regina')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'yera')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'yera')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'farel')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'farel')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'jali')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    '')

WebUI.click(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'bana')

WebUI.click(findTestObject('Object Repository/Customer Service/search/td_Administrasi Buku Cek'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/th_Nama'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/td_bana'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'))

WebUI.setText(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    'farel')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Customer Service/search/a_Actions'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/a_Edit'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/svg'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/a_Edit_1'))

WebUI.click(findTestObject('Object Repository/Customer Service/search/span_Dashboard'))

WebUI.closeBrowser()

