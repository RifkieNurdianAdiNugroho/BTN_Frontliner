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

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Email_email'), 'teller@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Teller/Add/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Teller/Add/span_Password_btn btn-sm btn-icon position-_28d309'))

WebUI.click(findTestObject('Object Repository/Teller/Add/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Teller/Add/span_Submission'))

WebUI.click(findTestObject('Object Repository/Teller/Add/a_Add Nasabah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nama_name'), 'kusnandar')

WebUI.doubleClick(findTestObject('Object Repository/Teller/Add/input_Alamat_address'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Alamat_address'), 'rejosari malang')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Telepon_phone'), '00332343')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Whatsapp_whatsapp'), '08242343423')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Email_email (1)'), 'kusnandar@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Pekerjaan               _14a113'), 
    'PNS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Layanan                 _f843a3'), 
    'setor_tunai', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_destination_account'), '1973252342')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_original_account'), '1953423434')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_amount'), '20000000')

WebUI.click(findTestObject('Object Repository/Teller/Add/input_Kategori_potential_category'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/textarea_Detail Potensi_potential_description'), 'pembayaran mobil')

WebUI.click(findTestObject('Object Repository/Teller/Add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Teller/Add/a_Add Nasabah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nama_name'), 'adewiryawan')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Alamat_address'), 'bekasi jakbar')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Telepon_phone'), '0045234234')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Whatsapp_whatsapp'), '082354656845')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Email_email (1)'), 'wirya123@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Pekerjaan               _14a113'), 
    'SWASTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp10.000.000 sampai Rp25.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Layanan                 _f843a3'), 
    'tarik_tunai', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_destination_account'), '18534523523')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_original_account'), '18535213424')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_amount'), '400000')

WebUI.click(findTestObject('Object Repository/Teller/Add/input_Kategori_potential_category'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/textarea_Detail Potensi_potential_description'), 'cash ambil')

WebUI.click(findTestObject('Object Repository/Teller/Add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Teller/Add/svg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Tipe                          _a91877'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nama_name'), 'hendra')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Alamat_address'), 'pakuwon Surabya')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Telepon_phone'), '08253343455')

WebUI.click(findTestObject('Object Repository/Teller/Add/div_Data Nasabah                           _492990'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Whatsapp_whatsapp'), '08235252333')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Email_email (1)'), 'hendra@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Pekerjaan               _14a113'), 
    'WIRASWASTA', true)

WebUI.click(findTestObject('Object Repository/Teller/Add/input_Nama Perusahaan_company_name'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nama Perusahaan_company_name'), 'degigroup')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jabatan                       _665c11'), 
    'KOMISARIS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp10.000.000 sampai Rp25.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Layanan                 _f843a3'), 
    'tarik_tunai', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_destination_account'), '26456723525')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_original_account'), '2563743674')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_amount'), '12000000')

WebUI.click(findTestObject('Object Repository/Teller/Add/label_Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/textarea_Detail Potensi_potential_description'), 'tarik tunai')

WebUI.click(findTestObject('Object Repository/Teller/Add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Teller/Add/a_Add Nasabah'))

WebUI.click(findTestObject('Object Repository/Teller/Add/span_Submission_1'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Data_form-control form-control-solid _bdc5aa'), 'hendra')

WebUI.click(findTestObject('Object Repository/Teller/Add/td_hendra'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Data_form-control form-control-solid _bdc5aa'), '')

WebUI.click(findTestObject('Object Repository/Teller/Add/div_Filter                                 _d64df8'))

WebUI.click(findTestObject('Object Repository/Teller/Add/svg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Tipe                          _a91877'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nama_name'), 'irmawati')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Alamat_address'), 'jenggolo karadenan')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Telepon_phone'), '08235235235')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nomor Whatsapp_whatsapp'), '08262335234')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Email_email (1)'), 'jenggolo123@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Pekerjaan               _14a113'), 
    'LAINNYA', true)

WebUI.click(findTestObject('Object Repository/Teller/Add/input_Nama Perusahaan_company_name'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Pekerjaan               _14a113'), 
    'WIRASWASTA', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Nama Perusahaan_company_name'), 'CV kalbira')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jabatan                       _665c11'), 
    'DIREKTUR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp25.000.000 sampai Rp50.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/Add/select_Pilih Jenis Layanan                 _f843a3'), 
    'pembayaran', true)

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_amount'), '20000000')

WebUI.setText(findTestObject('Object Repository/Teller/Add/input_Jenis Layanan_merchant_id'), '235232332')

WebUI.click(findTestObject('Object Repository/Teller/Add/label_Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Teller/Add/textarea_Detail Potensi_potential_description'), 'tes')

WebUI.click(findTestObject('Object Repository/Teller/Add/button_Submit                              _00b7a5'))

WebUI.closeBrowser()

