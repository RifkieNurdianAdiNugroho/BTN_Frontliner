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

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_Email_email (1)'), 'MarketingP@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing/Filter/input_Password_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Password_btn btn-sm btn-icon position-_28d309'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Marketing Assignment'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Marketing Assignment'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/svg (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'james')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Marketing Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_James Powell'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'ros')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'ros')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Angela Ross'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Rose Blake'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'putri')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Filter_svg-icon svg-icon-2'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua_1 (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/div_Berdasarkan                            _0b0cbb (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Marketing Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_sera'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_sera'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Badan Usaha'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_funding'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/div_No                                    N_06f1eb'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'j')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Benjamin Edmunds'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Joan Jones'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'tes')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Marketing Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'zoe')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Zoe Dickens'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Semua (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/span_Select option (1)'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/button_Submit (1)'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'dimas')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_dimas'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'zeke')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_Marketing Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    'sera')

WebUI.sendKeys(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/td_sera'))

WebUI.click(findTestObject('Object Repository/Marketing/Filter/input_List Assignment_form-control form-con_63420b (1)'))

WebUI.closeBrowser()

