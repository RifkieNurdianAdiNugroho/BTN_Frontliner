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

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Detail'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/td_087676543123'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/td_pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/td_pembiayaan'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Detail_1'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/td_PHONE'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/td_tesssuatee'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/td_5474534636'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Detail_1_2'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Actions'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Detail_1_2_3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/div_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/div_Cold'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/a_Cold'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Manager/Dashboard/Cold/detail/select_102550100'), '100', true)

WebUI.closeBrowser()

