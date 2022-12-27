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

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/input_Email_email'), 'MarketingP@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing/Detail/Add Activites/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Actions'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Detail'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Add Activites'))

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/input_Title_title'), 'tess')

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing/Detail/Add Activites/select_Pilih Status                        _5f7691'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/textarea_Note_note'), 'note pembayaran')

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/button_Add Activities'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/span_Marketing Assignment'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Actions'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Detail_1'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Add Activites'))

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/input_Title_title'), 'second')

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing/Detail/Add Activites/select_Pilih Status                        _5f7691'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing/Detail/Add Activites/select_Pilih Status                        _5f7691'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/textarea_Note_note'), 'second')

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/button_Add Activities'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/span_Marketing Assignment'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Actions'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/a_Detail_1_2'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/svg'))

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/input_Title_title'), 'third')

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing/Detail/Add Activites/select_Pilih Status                        _5f7691'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Marketing/Detail/Add Activites/textarea_Note_note'), 'last third')

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/button_Add Activities'))

WebUI.click(findTestObject('Object Repository/Marketing/Detail/Add Activites/span_Marketing Assignment'))

WebUI.closeBrowser()

