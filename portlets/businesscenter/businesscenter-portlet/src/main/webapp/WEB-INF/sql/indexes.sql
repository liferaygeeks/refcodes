create index IX_8DC88B19 on businesscenter_BusinessUser (uuid_);
create index IX_97D5BF6F on businesscenter_BusinessUser (uuid_, companyId);
create unique index IX_D15555B1 on businesscenter_BusinessUser (uuid_, groupId);

create index IX_3C10842E on businesscenter_Foo (field2);
create index IX_6D1F932 on businesscenter_Foo (uuid_);
create index IX_6494B7B6 on businesscenter_Foo (uuid_, companyId);
create unique index IX_DC33B3B8 on businesscenter_Foo (uuid_, groupId);