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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/span_Customer Service'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/a_Add User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Nama_name'), 'tessarossa')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Email_email (1)'), 
    'ress@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Nomor Telepon_phone'), 
    '08234234234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Password_password (1)'), 
    'o33KsPoRA/o=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/a_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/a_Add User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/label_Add Foto_btn btn-icon btn-circle btn-_3b5f44'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Nama_name'), 'sharee')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Email_email (1)'), 
    'share@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Nomor Telepon_phone'), 
    '082345234234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Password_password (1)'), 
    '+4QGqu3+cuA=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/label_Add Foto_btn btn-icon btn-circle btn-_3b5f44'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Nama_name'), 'restful')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Email_email (1)'), 
    'restful@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Nomor Telepon_phone'), 
    '0823523423')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/input_Password_password_1'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/i_Password_bi bi-eye fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/add data user/span_Save'))

WebUI.closeBrowser()

