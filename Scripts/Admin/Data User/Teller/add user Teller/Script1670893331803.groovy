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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/span_Teller'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Nama_name'), 'tellertes')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Email_email (1)'), 'tellertes@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Nomor Telepon_phone'), '08452352535')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Password_password (1)'), 
    'R1JJtLx9FQs=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/span_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/svg'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Nama_name'), 'tesuatteller')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Email_email (1)'), 'tesuatteller@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Nomor Telepon_phone'), '08345235234')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/div_Add Foto'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Password_password (1)'), 
    'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/i_Add Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Nama_name'), 'tesuatteller')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Email_email (1)'), 'tesuatteller@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Nomor Telepon_phone'), '08234124124')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/add data/input_Password_password_1'), '12345678')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/add data/span_Save'))

WebUI.closeBrowser()

