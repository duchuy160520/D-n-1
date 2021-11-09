create database DuAn1
go
use DuAn1
go

create table NhanVien(
MaNV nvarchar(10),
HoTen nvarchar(100),
NgaySinh date,
GioiTinh nvarchar(10),
DiaChi nvarchar(100),
SDT int,
TrangThai int,
VaiTro nchar(20),
primary key(MaNV)
)
go
insert into NhanVien values ('NV01',N'Nguyễn Thế Quân','2002-07-03',N'Nam',N'Đan Phượng-Hà Nội','0336918571',1,'Admin');
insert into NhanVien values ('NV02',N'Nguyễn Đức Huy','2002-08-01',N'Nam',N'Hoài Đức-Hà Nội','097488888',1,'Admin');
insert into NhanVien values ('NV03',N'Nguyễn Trung Hiếu','2002-10-10',N'Nam',N'Từ Sơn-Bắc Ninh','097111111',1,'Nhân viên');
insert into NhanVien values ('NV04',N'Quân thứ 2','2002-02-02',N'Nữ',N'Cát Bà','01587451445',0,'Nhân viên');
insert into NhanVien values ('NV05',N'Quân thứ 3','2002-03-03',N'Nam',N'Lào Cai','09777777',1,'Nhân viên');


create table NhaSanXuat(
MaNSX nvarchar(10),
HangSX nvarchar(20),
primary key(MaNSX)
)
go
insert into NhaSanXuat values ('NSX1','Apple');
insert into NhaSanXuat values ('NSX2','Oppo');
insert into NhaSanXuat values ('NSX3','LG');
insert into NhaSanXuat values ('NSX4','Xiaomi');
insert into NhaSanXuat values ('NSX5','SamSung');

create table MauSac(
MaMau nvarchar(10),
MauSac nvarchar(20),
primary key(MaMau)
)
go
insert into MauSac values ('M1','Red');
insert into MauSac values ('M2','Blue');
insert into MauSac values ('M3','Black');
insert into MauSac values ('M4','White');
insert into MauSac values ('M5','Pink');

create table SanPham(
MaSP nvarchar(10),
TenSP nvarchar(50),
primary key(MaSP)
)
go
insert into SanPham values('SP1','Iphone 7');
insert into SanPham values('SP2','Iphone 7Plus');
insert into SanPham values('SP3','Iphone 8');
insert into SanPham values('SP4','Iphone 8Plus');
insert into SanPham values('SP5','Iphone X');
insert into SanPham values('SP6','Iphone XSMAX');
insert into SanPham values('SP7','Iphone 11');
insert into SanPham values('SP8','Iphone 11Pro');
insert into SanPham values('SP9','Iphone 12');
insert into SanPham values('SP10','Iphone 12Pro');

insert into SanPham values ('SP11','Oppo A37');
insert into SanPham values ('SP12','Oppo A55');
insert into SanPham values ('SP13','Oppo A16');
insert into SanPham values ('SP14','Oppo A94');
insert into SanPham values ('SP15','Oppo A74');

insert into SanPham values ('SP16','Xiaomi Mi11');
insert into SanPham values ('SP17','Xiaomi Redmi K40');
insert into SanPham values ('SP18','Xiaomi Note 9T');
insert into SanPham values ('SP19','Xiaomi K40 Gaming');
insert into SanPham values ('SP20','Xiaomi Poco X3');

insert into SanPham values ('SP21','LG V50');
insert into SanPham values ('SP22','LG V40');
insert into SanPham values ('SP23','LG G7');
insert into SanPham values ('SP24','LG V30');
insert into SanPham values ('SP25','LG Q7');

insert into SanPham values ('SP26','Samsung Galaxy Z Fold2');
insert into SanPham values ('SP27','Samsung Galaxy S21');
insert into SanPham values ('SP28','Samsung Galaxy Note 20');
insert into SanPham values ('SP29','Samsung Galaxy A32');
insert into SanPham values ('SP30','Samsung Galaxy M51');


create table ChatLieu(
MaChatLieu nvarchar(10),
LoaiChatLieu nvarchar(50),
primary key(MaChatLieu)
)
go
insert into ChatLieu values ('CL1','Indium Tin Oxit(ITO)');
insert into ChatLieu values ('CL2','Lithium Coban Oxit (LiCoO2)');
insert into ChatLieu values ('CL3','Silicon');
insert into ChatLieu values ('CL4',N'Đồng');
insert into ChatLieu values ('CL5','Niken');

create table KichThuoc(
MaKichThuoc nvarchar(10),
KichThuoc nvarchar(50),
primary key(MaKichThuoc)
)
go
insert into KichThuoc values ('KT1','10 mm2');
insert into KichThuoc values ('KT2','11 mm2');
insert into KichThuoc values ('KT3','14 mm2');
insert into KichThuoc values ('KT4','16 mm2');

create table KhachHang(
MaKH nvarchar(10),
TenKH nvarchar(50),
SDT int,
GioiTinh nvarchar(10),
NgaySinh date,
MaNV nvarchar(10),
primary key (MaKH),
foreign key (MaNV) references NhanVien(MaNV)
)
go 
insert into KhachHang values ('KH1',N'Nguyễn Thế Quân','0336918571',N'Nam','2002-03-02','NV01');
insert into KhachHang values ('KH2',N'Nguyễn Đức Huy','0123456789',N'Nam','2002-01-01','NV02');
insert into KhachHang values ('KH3',N'Nguyễn Văn A','011111111',N'Nam','2002-02-02','NV01');
insert into KhachHang values ('KH4',N'Nguyễn Chí Phèo','022222222',N'Nam','2008-03-03','NV02');
insert into KhachHang values ('KH5',N'Nguyễn Thị Nở','0984561111',N'Nam','1945-04-04','NV01');
insert into KhachHang values ('KH6',N'Nguyễn Thế B','0984562222',N'Nam','1964-05-05','NV01');
insert into KhachHang values ('KH7',N'Nguyễn Thế C','0984563333',N'Nam','1972-06-06','NV01');
insert into KhachHang values ('KH8',N'Nguyễn Thế D','0984564444',N'Nữ','1999-07-07','NV05');
insert into KhachHang values ('KH9',N'Nguyễn Thế E','0984565555',N'Nam','1993-08-08','NV05');
insert into KhachHang values ('KH10',N'Nguyễn Thế F','0984566666',N'Nam','2001-09-09','NV05');
insert into KhachHang values ('KH11',N'Nguyễn Thế G','0984567777',N'Nam','2007-10-10','NV05');
insert into KhachHang values ('KH12',N'Nguyễn Thế H','0984568888',N'Nữ','2020-11-11','NV02');
insert into KhachHang values ('KH13',N'Nguyễn Thế J','0984569999',N'Nam','2015-12-12','NV01');
insert into KhachHang values ('KH14',N'Nguyễn Thế Q','0984561234',N'Nam','2002-13-13','NV05');
insert into KhachHang values ('KH15',N'Nguyễn Thế K','0984562345',N'Nam','2002-14-14','NV01');
insert into KhachHang values ('KH16',N'Nguyễn Thế T','0984563456',N'Nữ','2002-15-15','NV02');
insert into KhachHang values ('KH17',N'Nguyễn Thế U','0984564567',N'Nam','2002-16-16','NV01');
insert into KhachHang values ('KH18',N'Nguyễn Thế O','0984565678',N'Nữ','2002-17-17','NV01');

create table BaoHanh(
MaBH nvarchar(10),
MaSP nvarchar(10),
LoaiBH nvarchar(50),
ThoiHanBaoHanh nvarchar(20),
primary key (MaBH),
foreign key (MaSP) references SanPham(MaSP)
)
go
insert into BaoHanh values ('BH1','SP1','Bình thường','24 tháng');
insert into BaoHanh values ('BH2','SP2','Bình thường','12 tháng');
insert into BaoHanh values ('BH3','SP3','VIP','64 tháng');
insert into BaoHanh values ('BH4','SP4','Bình thường','6 tháng');
insert into BaoHanh values ('BH5','SP5','VIP','24 tháng');
insert into BaoHanh values ('BH6','SP6','Bình thường','4 tháng');
insert into BaoHanh values ('BH7','SP7','VIP','120 tháng');
insert into BaoHanh values ('BH8','SP8','Bình thường','8 tháng');
insert into BaoHanh values ('BH9','SP9','VIP','16 tháng');
insert into BaoHanh values ('BH10','SP10','Bình thường','7 tháng');
insert into BaoHanh values ('BH11','SP11','VIP','1 tháng');
insert into BaoHanh values ('BH12','SP12','Bình thường','Trọn đời');

create table HoaDon(
MaHD nvarchar(10),
MaBH nvarchar(10),
MaKH nvarchar(10),
TenKH nvarchar(50),
NgayBan date,
TrangThai int
primary key (MaHD),
foreign key (MaBH) references BaoHanh(MaBH),
foreign key (MaKH) references KhachHang(MaKH)
)
go
insert into HoaDon values ('HD1','BH1','KH1',N'Nguyễn Thế Quân','2020-03-02',1);
insert into HoaDon values ('HD2','BH2','KH2',N'Nguyễn Đức Huy','2019-03-02',1);
insert into HoaDon values ('HD3','BH3','KH3',N'Nguyễn Văn A','2018-03-02',0);
insert into HoaDon values ('HD4','BH4','KH4',N'Nguyễn Chí Phèo','2017-03-02',1);
insert into HoaDon values ('HD5','BH5','KH5',N'Nguyễn Thị Nở','2021-03-02',0);
insert into HoaDon values ('HD6','BH6','KH6',N'Nguyễn Thế B','2020-05-05',1);
insert into HoaDon values ('HD7','BH7','KH7',N'Nguyễn Thế C','2020-06-02',1);

create table HoaDonChiTiet(
MaHDCT nvarchar(10),
MaSP nvarchar(10),
MaHD nvarchar(10),
GiaBan float,
Soluong int,
NgayMua date,
TrangThai int,
primary key (MaHDCT),
foreign key (MaSP) references SanPham(MaSP),
foreign key (MaHD) references HoaDon(MaHD)
)
go

create table SanPhamChiTiet(
ID int identity(1,1) primary key,
MaSP nvarchar(10),
MaNSX nvarchar(10),
MaMau nvarchar(10),
MaChatLieu nvarchar(10),
MaKichThuoc nvarchar(10),
TenSP nvarchar(50),
SoLuong int,
GiaBan float,
TrangThai int,
ChatLieu nvarchar(20),
foreign key (MaSP) references SanPham(MaSP),
foreign key (MaNSX) references NhaSanXuat(MaNSX),
foreign key (MaMau) references MauSac(MaMau),
foreign key (MaChatLieu) references ChatLieu(MaChatLieu),
foreign key (MaKichThuoc) references KichThuoc(MaKichThuoc)
)
go
insert into SanPhamChiTiet values ('SP1','NSX1','M1','CL1','KT1','Iphone 7',10,10000000,1,'Silicon');
insert into SanPhamChiTiet values ('SP2','NSX2','M2','CL2','KT2','Iphone 7 Plus',12,500000,0,'Đồng');
insert into SanPhamChiTiet values ('SP3','NSX3','M3','CL3','KT3','Iphone X',8,1500000,0,'Niken');
insert into SanPhamChiTiet values ('SP4','NSX4','M4','CL4','KT4','Iphone XSMAX',9,20000000,1,'Indium Tin Oxit(ITO)');
insert into SanPhamChiTiet values ('SP5','NSX5','M5','CL5','KT1','Iphone 11',20,3000000,1,'Niken');

select MaSP, TenSP, HangSX, KichThuoc, ChatLieu, MauSac, SoLuong, GiaBan, TrangThai
from SanPhamChiTiet inner join NhaSanXuat on SanPhamChiTiet.MaNSX=NhaSanXuat.MaNSX
                    inner join KichThuoc on SanPhamChiTiet.MaKichThuoc=KichThuoc.MaKichThuoc
					inner join MauSac on SanPhamChiTiet.MaMau=MauSac.MaMau