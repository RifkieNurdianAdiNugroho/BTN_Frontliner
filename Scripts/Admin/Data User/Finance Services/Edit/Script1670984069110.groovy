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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/span_Financing Service'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Nama_name'), 'tesuatawesam23')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Nomor Telepon_phone'), '081234235345')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Password_password (1)'), 
    'aU/kf7hTpyQ=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/a_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/label_Edit Foto_btn btn-icon btn-circle btn_caf665'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Nama_name'), 'tesuatawesam1212')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/div_Nomor Telepon'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Nomor Telepon_phone'), '09811234124124')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Password_password (1)'), 
    'ABdxqtKrMrjcaniLVMqtrg==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/button_Cancel'))

WebUI.doubleClick(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/i_Edit Foto_bi bi-x fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Nama_name'), 'tesuatawesam12')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Nomor Telepon_phone'), '08434234234234')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/input_Password_password_1'), '12345678')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Finance Service/Edit/span_Save'))

WebUI.closeBrowser()

