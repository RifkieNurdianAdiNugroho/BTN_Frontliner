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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/span_Marketing'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/rect'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/label_Add Foto_btn btn-icon btn-circle btn-_3b5f44'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nama_name'), 'marketingtes')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Email_email (1)'), 'marketingtes@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nomor Telepon_phone'), 
    '08234234234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Password_password (1)'), 
    'uY/g6hbbhh5TGB5NsgDJiA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/select_Funding                             _c776c3'), 
    'funding', true)

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/span_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nama_name'), 'marketinfundin')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Email_email (1)'), 'marketingfunding@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nomor Telepon_phone'), 
    '0812341412423')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Password_password (1)'), 
    '6MwV37pA8lCjSjYoku9s9Q==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/select_Funding                             _c776c3'), 
    'financing', true)

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nama_name'), 'tesmarketing')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Email_email (1)'), 'marketin@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nomor Telepon_phone'), 
    '08123424124')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Password_password (1)'), 
    'CoAzf9LH6xK4Eqe5H2xSWg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/select_Funding                             _c776c3'), 
    'financing', true)

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/label_Add Foto_btn btn-icon btn-circle btn-_3b5f44'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nama_name'), 'funding')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Email_email (1)'), 'marketingfun@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Nomor Telepon_phone'), 
    '08234234412')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/input_Password_password (1)'), 
    's/o3WrzH7f8=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/select_Funding                             _c776c3'), 
    'funding', true)

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/span_Save'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/add user Marketing/a_Actions'))

WebUI.closeBrowser()

