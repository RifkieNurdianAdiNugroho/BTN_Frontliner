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

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Service/edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Customer Service/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Customer Service/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Customer Service/edit/span_Submission'))

WebUI.click(findTestObject('Object Repository/Customer Service/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Customer Service/edit/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih tipe                          _690a33'), 
    'personal', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Profesi                       _dd428e'), 
    'PNS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Jumlah Pendapatan             _943e51'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/edit/input_Nomor Whatsapp_whatsapp'), '08083462345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Jenis Layanan                 _b5175c'), 
    'administrasi_daftar_bank_hitam', true)

WebUI.click(findTestObject('Object Repository/Customer Service/edit/label_Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Customer Service/edit/textarea_tabungaan baru'), 'pembayaran')

WebUI.click(findTestObject('Object Repository/Customer Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Customer Service/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Customer Service/edit/a_Edit_1'))

WebUI.setText(findTestObject('Object Repository/Customer Service/edit/input_Nomor Telepon_phone'), '08523423523')

WebUI.click(findTestObject('Object Repository/Customer Service/edit/div_Nomor Whatsapp'))

WebUI.setText(findTestObject('Object Repository/Customer Service/edit/input_Nomor Whatsapp_whatsapp'), '08235234523')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih tipe                          _690a33'), 
    'badan_usaha', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Jabatan                       _8df9f8'), 
    'KOMISARIS', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/edit/input_Nama Perusahaan_company_name'), 'arey corporate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Jumlah Pendapatan             _943e51'), 
    'Rp5.000.000 sampai Rp10.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Jenis Layanan                 _b5175c'), 
    'administrasi_daftar_rehabilitasi_nasabah', true)

WebUI.click(findTestObject('Object Repository/Customer Service/edit/div_Detail Potensi                         _6a8576'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/edit/select_Pilih Jenis Layanan                 _b5175c'), 
    'komplain', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/edit/textarea_tes'), 'Bank pembayaran muamalat')

WebUI.click(findTestObject('Object Repository/Customer Service/edit/button_Submit                              _00b7a5'))

WebUI.closeBrowser()

