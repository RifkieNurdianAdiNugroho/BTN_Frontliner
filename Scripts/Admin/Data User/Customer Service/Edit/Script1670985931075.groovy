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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/a_Customer Service'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nama_name'), 'editrestful')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nomor Telepon_phone'), '0824324234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Password_password (1)'), 
    'aU/kf7hTpyQ=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/span_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nama_name'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nama_name'), 'restfultescancel')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nomor Telepon_phone'), '08234234324')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Password_password (1)'), 
    '9+UxvXdGadM=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Edit Foto_bi bi-x fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nama_name'), 'restfultes')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Nomor Telepon_phone'), '0834524234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/input_Password_password (1)'), 
    '9+UxvXdGadM=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Customer Service/edit/span_Save'))

WebUI.closeBrowser()

