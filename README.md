# MyArsitektur – Form Pendaftaran Siswa (MVVM)

Aplikasi Android (Kotlin + Jetpack Compose) untuk praktikum Pengembangan Aplikasi Mobile.

- **model**: `Siswa`, `DataJK`
- **viewmodel**: `SiswaViewModel` (StateFlow)
- **view**: `FormSiswa`, `TampilSiswa`
- **view/uicontroller**: `Navigasi` (NavHost: Formulir → Detail)

## Database Room (Edit, Update, Delete)

Lapisan Room ditambahkan tanpa mengubah kode MVVM di atas.

- **room**: `Siswa` (entity `tblSiswa`: id, nama, alamat, telpon), `SiswaDao` (getAllSiswa, getSiswa, insert, update, delete), `DatabaseSiswa`
- **repositori**: `RepositoriSiswa` + `OfflineRepositoriSiswa`, `ContainerApp` + `ContainerDataApp`
- **AplikasiSiswa**: kelas `Application` (terdaftar di `AndroidManifest.xml`) yang menyimpan container
- **view/route**: `DestinasiNavigasi`, `DestinasiDetailSiswa`, `DestinasiEditSiswa`
- **viewmodel**: `EntryViewModel` (+ `UIStateSiswa`, `DetailSiswa`), `EditViewModel`
- **viewmodel/provider**: `PenyediaViewModel` (factory ViewModel)

> Catatan: `room.Siswa` (entity database) berbeda dengan `model.Siswa` (MVVM).

Dependensi: Room 2.8.5 dengan KSP 2.3.14 (mendukung Kotlin bawaan AGP 9).
