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

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/span_Manager'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/a_Add User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Nama_name'), 'tessatu')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Email_email (1)'), 'tessatu@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Nomor Telepon_phone'), '08312414234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Password_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/a_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/a_Add User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Nama_name'), 'tessatu')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Email_email (1)'), 'tessatu@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Nomor Telepon_phone'), '08342352352')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Password_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Nama_name'), 'tesmanager')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Email_email (1)'), 'tesmanager@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Nomor Telepon_phone'), '0813325452352')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/add user manager/input_Password_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/add user manager/span_Save'))

WebUI.closeBrowser()

