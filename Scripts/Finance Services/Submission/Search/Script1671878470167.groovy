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

WebUI.setText(findTestObject('Object Repository/Finance Service/Search/input_Email_email'), 'FinanceServies1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Finance Service/Search/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Finance Service/Search/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Finance Service/Search/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Finance Service/Search/span_Submission'))

WebUI.setText(findTestObject('Object Repository/Finance Service/Search/input_Data_form-control form-control-solid _bdc5aa'), 
    'sera')

WebUI.click(findTestObject('Object Repository/Finance Service/Search/td_sera'))

WebUI.setText(findTestObject('Object Repository/Finance Service/Search/input_Data_form-control form-control-solid _bdc5aa'), 
    'atera')

WebUI.sendKeys(findTestObject('Object Repository/Finance Service/Search/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Finance Service/Search/input_Data_form-control form-control-solid _bdc5aa'), 
    '')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/Search/select_102550100'), '50', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/Search/input_Data_form-control form-control-solid _bdc5aa'), 
    '')

WebUI.closeBrowser()

