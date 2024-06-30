import React, {useEffect, useState} from 'react';
import {Table} from "antd";

export function CarTable() {
    const [data, setData] = useState<any>([]);

    useEffect(() => {
        (async () => {
            try {
                const response = await fetch('http://localhost:8000/cars');
                const data = await response.json();
                setData(data);
            } catch (e) {
                console.error('Fetch error', e);
            }
        })();
    }, []);


    const columns = [
        {
            title: 'id',
            dataIndex: 'id',
            key: 'id',
        },
        {
            title: 'userid',
            dataIndex: 'userId',
            key: 'userid',
        },
        {
            title: 'Manufacturer',
            dataIndex: 'make',
            key: 'make',
        },
        {
            title: 'Model',
            dataIndex: 'model',
            key: 'model',
        },
        {
            title: 'Year',
            dataIndex: 'year',
            key: 'year',
        }
    ];

    return <Table columns={columns} dataSource={data} rowKey="id" pagination={false} loading={!data}/>;
}
